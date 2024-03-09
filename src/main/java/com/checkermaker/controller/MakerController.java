package com.checkermaker.controller;
import com.checkermaker.dao.entity.CustomerMaster;
import com.checkermaker.dao.entity.CustomerTemp;
import com.checkermaker.dao.impl.CustomerRepository;
import com.checkermaker.formBean.FileUpload;
import com.checkermaker.formBean.CustomerBeanForm2;
import com.checkermaker.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.io.*;
import java.security.Principal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Controller
public class MakerController {
    @Autowired
    private CustomerService customerService;


//    @Autowired
//    public MakerController(CustomerService customerService) {
//        this.customerService = customerService;
//    }

    private CustomerTemp changeCustomerMasterToCustomerTemp(CustomerMaster cMaster) {
        CustomerTemp customerTemp = new CustomerTemp();
        customerTemp.setAuthorizedBy(cMaster.getAuthorizedBy());
        customerTemp.setCustomerId(cMaster.getCustomerId());
        customerTemp.setCustomerAddress1(cMaster.getCustomerAddress1());
        customerTemp.setCustomerAddress2(cMaster.getCustomerAddress2());
        customerTemp.setCustomerCode(cMaster.getCustomerCode());
        customerTemp.setCustomerName(cMaster.getCustomerName());
        customerTemp.setContactNumber(cMaster.getContactNumber());
        customerTemp.setActiveInactive(cMaster.getActiveInactive());
        customerTemp.setCustomerPinCode(cMaster.getCustomerPinCode());
        customerTemp.setCreatedBy(cMaster.getCreatedBy());
        customerTemp.setCreatedDate(cMaster.getCreatedDate());
        customerTemp.setAuthorizedDate(cMaster.getAuthorizedDate());
        customerTemp.setEmailAddress(cMaster.getEmailAddress());
        customerTemp.setModifiedBy(cMaster.getModifiedBy());
        customerTemp.setModifiedDate(cMaster.getModifiedDate());
        customerTemp.setPrimaryContactPerson(cMaster.getPrimaryContactPerson());
        customerTemp.setRecordStatus(cMaster.getRecordStatus());
        return customerTemp;

    }

    private CustomerBeanForm2 changeCustomerMasterToCustomerBeanForm2(CustomerMaster cMaster) {
        CustomerBeanForm2 customerBeanForm2 = new CustomerBeanForm2();
        customerBeanForm2.setAuthorizedBy(cMaster.getAuthorizedBy());
        customerBeanForm2.setCustomerId(cMaster.getCustomerId());
        customerBeanForm2.setCustomerAddress1(cMaster.getCustomerAddress1());
        customerBeanForm2.setCustomerAddress2(cMaster.getCustomerAddress2());
        customerBeanForm2.setCustomerCode(cMaster.getCustomerCode());
        customerBeanForm2.setCustomerName(cMaster.getCustomerName());
        customerBeanForm2.setContactNumber(cMaster.getContactNumber());
        customerBeanForm2.setActiveInactive(cMaster.getActiveInactive());
        customerBeanForm2.setCustomerPinCode(cMaster.getCustomerPinCode());
        customerBeanForm2.setCreatedBy(cMaster.getCreatedBy());
        customerBeanForm2.setCreatedDate(cMaster.getCreatedDate());
        customerBeanForm2.setAuthorizedDate(cMaster.getAuthorizedDate());
        customerBeanForm2.setEmailAddress(cMaster.getEmailAddress());
        customerBeanForm2.setModifiedBy(cMaster.getModifiedBy());
        customerBeanForm2.setModifiedDate(cMaster.getModifiedDate());
        customerBeanForm2.setPrimaryContactPerson(cMaster.getPrimaryContactPerson());
        customerBeanForm2.setRecordStatus(cMaster.getRecordStatus());
        return customerBeanForm2;

    }

    private CustomerBeanForm2 changeCustomerTempToCustomerBeanForm2(CustomerTemp cTemp) {
        CustomerBeanForm2 customerBeanForm2 = new CustomerBeanForm2();
        customerBeanForm2.setAuthorizedBy(cTemp.getAuthorizedBy());
        customerBeanForm2.setCustomerId(cTemp.getCustomerId());
        customerBeanForm2.setCustomerAddress1(cTemp.getCustomerAddress1());
        customerBeanForm2.setCustomerAddress2(cTemp.getCustomerAddress2());
        customerBeanForm2.setCustomerCode(cTemp.getCustomerCode());
        customerBeanForm2.setCustomerName(cTemp.getCustomerName());
        customerBeanForm2.setContactNumber(cTemp.getContactNumber());
        customerBeanForm2.setActiveInactive(cTemp.getActiveInactive());
        customerBeanForm2.setCustomerPinCode(cTemp.getCustomerPinCode());
        customerBeanForm2.setCreatedBy(cTemp.getCreatedBy());
        customerBeanForm2.setCreatedDate(cTemp.getCreatedDate());
        customerBeanForm2.setAuthorizedDate(cTemp.getAuthorizedDate());
        customerBeanForm2.setEmailAddress(cTemp.getEmailAddress());
        customerBeanForm2.setModifiedBy(cTemp.getModifiedBy());
        customerBeanForm2.setModifiedDate(cTemp.getModifiedDate());
        customerBeanForm2.setPrimaryContactPerson(cTemp.getPrimaryContactPerson());
        customerBeanForm2.setRecordStatus(cTemp.getRecordStatus());
        return customerBeanForm2;

    }

    private CustomerTemp CustomerBeanForm2ToCustomerTemp(CustomerBeanForm2 customerBeanForm2) {
        CustomerTemp customerTemp = new CustomerTemp();
        customerTemp.setAuthorizedBy(customerBeanForm2.getAuthorizedBy());
        customerTemp.setCustomerId(customerBeanForm2.getCustomerId());
        customerTemp.setCustomerAddress1(customerBeanForm2.getCustomerAddress1());
        customerTemp.setCustomerAddress2(customerBeanForm2.getCustomerAddress2());
        customerTemp.setCustomerCode(customerBeanForm2.getCustomerCode());
        customerTemp.setCustomerName(customerBeanForm2.getCustomerName());
        customerTemp.setContactNumber(customerBeanForm2.getContactNumber());
        customerTemp.setActiveInactive(customerBeanForm2.getActiveInactive());
        customerTemp.setCustomerPinCode(customerBeanForm2.getCustomerPinCode());
        customerTemp.setCreatedBy(customerBeanForm2.getCreatedBy());
        customerTemp.setCreatedDate(customerBeanForm2.getCreatedDate());
        customerTemp.setAuthorizedDate(customerBeanForm2.getAuthorizedDate());
        customerTemp.setEmailAddress(customerBeanForm2.getEmailAddress());
        customerTemp.setModifiedBy(customerBeanForm2.getModifiedBy());
        customerTemp.setModifiedDate(customerBeanForm2.getModifiedDate());
        customerTemp.setPrimaryContactPerson(customerBeanForm2.getPrimaryContactPerson());
        customerTemp.setRecordStatus(customerBeanForm2.getRecordStatus());
        return customerTemp;

    }

    private CustomerMaster CustomerBeanForm2ToCustomerMaster(CustomerBeanForm2 customerBeanForm2) {
        CustomerMaster customerMaster = new CustomerMaster();
        customerMaster.setAuthorizedBy(customerBeanForm2.getAuthorizedBy());
        customerMaster.setCustomerId(customerBeanForm2.getCustomerId());
        customerMaster.setCustomerAddress1(customerBeanForm2.getCustomerAddress1());
        customerMaster.setCustomerAddress2(customerBeanForm2.getCustomerAddress2());
        customerMaster.setCustomerCode(customerBeanForm2.getCustomerCode());
        customerMaster.setCustomerName(customerBeanForm2.getCustomerName());
        customerMaster.setContactNumber(customerBeanForm2.getContactNumber());
        customerMaster.setActiveInactive(customerBeanForm2.getActiveInactive());
        customerMaster.setCustomerPinCode(customerBeanForm2.getCustomerPinCode());
        customerMaster.setCreatedBy(customerBeanForm2.getCreatedBy());
        customerMaster.setCreatedDate(customerBeanForm2.getCreatedDate());
        customerMaster.setAuthorizedDate(customerBeanForm2.getAuthorizedDate());
        customerMaster.setEmailAddress(customerBeanForm2.getEmailAddress());
        customerMaster.setModifiedBy(customerBeanForm2.getModifiedBy());
        customerMaster.setModifiedDate(customerBeanForm2.getModifiedDate());
        customerMaster.setPrimaryContactPerson(customerBeanForm2.getPrimaryContactPerson());
        customerMaster.setRecordStatus(customerBeanForm2.getRecordStatus());
        return customerMaster;

    }

    @GetMapping(path = "/")
    public String sayHome(ModelMap model) {
        return "home";
    }


    @GetMapping(path = "maker")
    public String makerhome(ModelMap model) {
        model.addAttribute("ListOfCustomerFromTempTable", customerService.getAllCustomersTemp());
        model.addAttribute("ListOfCustomerFromMasterTable", customerService.getAllCustomerMaster());
        return "home_maker";
    }


    @GetMapping(path = "addcustomer")
    public String addCustomerGet(ModelMap model) {
        CustomerBeanForm2 customer = new CustomerBeanForm2();
        model.addAttribute("customerBean", customer);
        return "addCustomer";
    }


    @PostMapping(path = "addcustomer")
    public String addCustomerPost(@Valid @ModelAttribute(name = "customerBean") CustomerBeanForm2 c, BindingResult bindingResult, Principal principal) {
        if (bindingResult.hasErrors()) {
            return "addCustomer";
        }else {
            DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDateTime now = LocalDateTime.now();
            String currentDateInString = date.format(now);
            CustomerTemp customerTemp = CustomerBeanForm2ToCustomerTemp(c);
            customerTemp.setActiveInactive("A");
            customerTemp.setRecordStatus("N");
            customerTemp.setCreatedBy(principal.getName());
            customerTemp.setCreatedDate(currentDateInString);
            customerService.addCustomer(customerTemp);
            return "redirect:maker";
        }

    }

    @GetMapping(path = "addcustomerbyfile")
    public String addCustomerFile(Model model) {
        FileUpload fileUpload= new FileUpload();
        model.addAttribute("file1" , fileUpload);
        return "addCustomerByFile";
    }

    @PostMapping(path = "addcustomerbyfile")
    public String addCustomerFilePost(@ModelAttribute(name="file1") FileUpload fileUpload,HttpSession session, Principal principal) {
        System.out.println(fileUpload);
        MultipartFile file = fileUpload.getFileData();
        try
        {

        InputStream inputStream = file.getInputStream();
        List<CustomerTemp> customerTempList=new ArrayList<>();
        Scanner scanner=new Scanner(inputStream);
        int i=1;
        while (scanner.hasNextLine())
        {
            DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDateTime now = LocalDateTime.now();
            String currentDateInString = date.format(now);
            CustomerTemp customerTemp = new CustomerTemp();
            String s=scanner.nextLine();
            String[] data=s.split(" ");
            customerTemp.setCustomerId(i++);
            customerTemp.setCustomerCode(data[0]);
            customerTemp.setCustomerName(data[1]);
            customerTemp.setCustomerAddress1(data[2]);
            customerTemp.setCustomerAddress2(data[3]);
            customerTemp.setCustomerPinCode(Integer.parseInt(data[4]));
            customerTemp.setEmailAddress(data[5]);
            customerTemp.setContactNumber(data[6]);
            customerTemp.setPrimaryContactPerson(data[7]);
            customerTemp.setActiveInactive("A");
            customerTemp.setRecordStatus("N");
            customerTemp.setCreatedBy(principal.getName());
            customerTemp.setCreatedDate(currentDateInString);
            System.out.println(customerTemp);
            customerTempList.add(customerTemp);
        }
            customerService.addCustomerList(customerTempList);
       }
       catch (IOException io)
       {
           io.printStackTrace();
       }
        return "redirect:maker";
    }



    @GetMapping(path = "updateCustomer")
    public String getUpdateCustomerFromTempTable(ModelMap modelMap, @RequestParam(name = "id") int customerId, @RequestParam(name = "T") String table) {
        if (table.equals("temp")) {
            CustomerTemp cTemp = customerService.getById(customerId);
            CustomerBeanForm2 customerBeanForm2 = changeCustomerTempToCustomerBeanForm2(cTemp);
            modelMap.addAttribute("customerFormBean", customerBeanForm2);
            modelMap.addAttribute("tableName", table);
        } else if (table.equals("master")) {
            CustomerMaster cMaster = customerService.getByIdMasterTable(customerId);
            CustomerTemp cTemp = changeCustomerMasterToCustomerTemp(cMaster);
            CustomerBeanForm2 customerBeanForm2 = changeCustomerTempToCustomerBeanForm2(cTemp);
            modelMap.addAttribute("customerFormBean", customerBeanForm2);
            modelMap.addAttribute("tableName", table);
        }
        return "updateCustomer";
    }

    @PostMapping("updateCustomer")
    public String postUpdateCustomerFromTempTable(ModelMap modelMap, Principal principal, @RequestParam(name = "id") int customerId, @RequestParam(name = "T") String table,
                                                  @Valid @ModelAttribute(name = "customerFormBean") CustomerBeanForm2 c, BindingResult bindingResult) {
        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        String currentDateInString = date.format(now);

        if (table.equals("temp")) {
            if (bindingResult.hasErrors()) {
                return "updateCustomer";
            }
            CustomerTemp cTemp = customerService.getById(c.getCustomerId());

            if (cTemp.getRecordStatus().equals("N") || cTemp.getRecordStatus().equals("NR")) {
                CustomerTemp customerTemp = CustomerBeanForm2ToCustomerTemp(c);
                customerTemp.setRecordStatus("N");
                customerTemp.setModifiedBy(principal.getName());
                customerTemp.setModifiedDate(currentDateInString);
                customerService.updateCustomer(customerTemp);
            }
            if (cTemp.getRecordStatus().equals("A") || cTemp.getRecordStatus().equals("M")) {
                CustomerTemp customerTemp = CustomerBeanForm2ToCustomerTemp(c);
                customerTemp.setRecordStatus("M");
                customerTemp.setModifiedBy(principal.getName());
                customerTemp.setModifiedDate(currentDateInString);
                customerService.updateCustomer(customerTemp);
            }
            if (cTemp.getRecordStatus().equals("MR")) {
                CustomerTemp customerTemp = CustomerBeanForm2ToCustomerTemp(c);
//                customerTemp.setRecordStatus("N");
                customerTemp.setRecordStatus("M");
                customerTemp.setModifiedBy(principal.getName());
                customerTemp.setModifiedDate(currentDateInString);
                customerService.updateCustomer(customerTemp);
            }
            if (cTemp.getRecordStatus().equals("DR")) {
                CustomerTemp customerTemp = CustomerBeanForm2ToCustomerTemp(c);
//                customerTemp.setRecordStatus("N");
                customerTemp.setRecordStatus("M");
                customerTemp.setModifiedBy(principal.getName());
                customerTemp.setModifiedDate(currentDateInString);
                customerService.updateCustomer(customerTemp);
            }

        } else if (table.equals("master")) {
            if (bindingResult.hasErrors()) {
                return "updateCustomer";
            }
            CustomerTemp cTemp = CustomerBeanForm2ToCustomerTemp(c);
            cTemp.setRecordStatus("M");
            cTemp.setModifiedBy(principal.getName());
            cTemp.setModifiedDate(currentDateInString);
            customerService.moveCustomerFromMasterTableToTempTable(cTemp);
        }
        return "redirect:maker";
    }


    @GetMapping("deleteCustomer")
    public String deleteCustomerFromTempTable(ModelMap modelMap, @RequestParam(name = "id") int customerId, @RequestParam(name = "T") String table) {
        if (table.equals("temp")) {
            CustomerTemp customerTemp = customerService.getById(customerId);
            if (customerTemp.getRecordStatus().equals("N") || customerTemp.getRecordStatus().equals("NR") || customerTemp.getRecordStatus().equals("M") ||
                    customerTemp.getRecordStatus().equals("MR")) {
                customerService.deleteCustomer(customerId);
            } else if(customerTemp.getRecordStatus().equals("DR")){
                customerTemp.setRecordStatus("D");
                customerService.updateCustomer(customerTemp);
            }
        }
        if (table.equals("master")) {
            CustomerMaster customerMaster = customerService.getByIdMasterTable(customerId);
            CustomerTemp customerTemp = changeCustomerMasterToCustomerTemp(customerMaster);
            customerTemp.setRecordStatus("D");
            customerService.moveCustomerFromMasterTableToTempTable(customerTemp);
        }

        return "redirect:maker";
    }


    @GetMapping("viewCustomer")
    public String viewCustomerMaker(ModelMap modelMap, @RequestParam(name = "id") int customerId, @RequestParam(name = "T") String table) {
        if (table.equals("temp")) {
            CustomerTemp customer = customerService.getById(customerId);
            modelMap.addAttribute("customerDetails", customer);
        } else if (table.equals("master")) {
            CustomerMaster customer = customerService.getByIdMasterTable(customerId);
            modelMap.addAttribute("customerDetails", customer);
        }

        return "view";
    }


}