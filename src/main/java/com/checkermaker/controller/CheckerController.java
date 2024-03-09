package com.checkermaker.controller;

import com.checkermaker.dao.entity.CustomerMaster;
import com.checkermaker.dao.entity.CustomerTemp;
import com.checkermaker.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Controller
public class CheckerController {
    @Autowired
    private CustomerService customerService;

//    @Autowired
//    public CheckerController(CustomerService customerService) {
//        this.customerService = customerService;
//    }

    private CustomerMaster changeCustomerTempToCustomerMaster(CustomerTemp cTemp) {
        CustomerMaster customerMaster = new CustomerMaster();
        customerMaster.setAuthorizedBy(cTemp.getAuthorizedBy());
        customerMaster.setCustomerId(cTemp.getCustomerId());
        customerMaster.setCustomerAddress1(cTemp.getCustomerAddress1());
        customerMaster.setCustomerAddress2(cTemp.getCustomerAddress2());
        customerMaster.setCustomerCode(cTemp.getCustomerCode());
        customerMaster.setCustomerName(cTemp.getCustomerName());
        customerMaster.setContactNumber(cTemp.getContactNumber());
        customerMaster.setActiveInactive(cTemp.getActiveInactive());
        customerMaster.setCustomerPinCode(cTemp.getCustomerPinCode());
        customerMaster.setCreatedBy(cTemp.getCreatedBy());
        customerMaster.setCreatedDate(cTemp.getCreatedDate());
        customerMaster.setAuthorizedDate(cTemp.getAuthorizedDate());
        customerMaster.setEmailAddress(cTemp.getEmailAddress());
        customerMaster.setModifiedBy(cTemp.getModifiedBy());
        customerMaster.setModifiedDate(cTemp.getModifiedDate());
        customerMaster.setPrimaryContactPerson(cTemp.getPrimaryContactPerson());
        customerMaster.setRecordStatus(cTemp.getRecordStatus());
        return customerMaster;

    }

    @GetMapping(path = "checker")
    public String checkerHome(ModelMap model) {
        model.addAttribute("newRegisterCustomerList", customerService.getAllNewRegisterdCustomerChecker());
        List<CustomerTemp> list = customerService.getAllNewRegisterdCustomerChecker();
        return "home_checker";
    }

    @GetMapping("approveCustomer")
    public String approvedNewCustomer(ModelMap modelMap, Principal principal, @RequestParam(name = "id") int customerId, @RequestParam(name = "status") String status) {
        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        String currentDateInString = date.format(now);
        if (status.equals("N")) {
            CustomerTemp cTemp = customerService.getById(customerId);
            CustomerMaster cMaster = changeCustomerTempToCustomerMaster(cTemp);
                cMaster.setRecordStatus("A");
                cMaster.setAuthorizedDate(currentDateInString);
                cMaster.setAuthorizedBy(principal.getName());
                customerService.addCustomerMasterTable(cMaster);
                customerService.deleteCustomer(customerId);
            }


        if (status.equals("D")) {
            CustomerTemp customerTemp = customerService.getById(customerId);
            customerService.deleteCustomer(customerId);
            customerService.deleteCustomerFromMasterTable(customerTemp.getCustomerCode());
        }
        if (status.equals("M")) {
            CustomerTemp cTemp = customerService.getById(customerId);
            CustomerMaster customerMaster1 = customerService.getByCustomerCodeFromMaster(cTemp.getCustomerCode());
            CustomerMaster customerMaster = changeCustomerTempToCustomerMaster(cTemp);
            customerMaster.setRecordStatus("A");
            customerMaster.setCustomerId(customerMaster1.getCustomerId());
            customerMaster.setAuthorizedBy(principal.getName());
            customerMaster.setAuthorizedDate(currentDateInString);
            customerService.updateCustomerMasterTable(customerMaster);
            customerService.deleteCustomer(cTemp.getCustomerId());

        }
        return "redirect:checker";
    }

    @GetMapping("rejectCustomer")
    public String rejectNewCustomer(ModelMap modelMap, Principal principal, @RequestParam(name = "id") int customerId) {
        CustomerTemp customerTemp = customerService.getById(customerId);
        if (customerTemp.getRecordStatus().equals("N")) {
            customerTemp.setRecordStatus("NR");
            customerService.updateCustomer(customerTemp);
        }
        if (customerTemp.getRecordStatus().equals("M")) {
            customerTemp.setRecordStatus("MR");
            customerService.updateCustomer(customerTemp);
        }
        if (customerTemp.getRecordStatus().equals("D")) {
            customerTemp.setRecordStatus("DR");
            customerService.updateCustomer(customerTemp);
        }
        return "redirect:checker";
    }

}
