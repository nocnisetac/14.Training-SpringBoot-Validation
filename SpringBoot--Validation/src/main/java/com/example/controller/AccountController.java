package com.example.controller;

import javax.validation.*;

import org.springframework.stereotype.*;
import org.springframework.ui.ModelMap;
import org.springframework.validation.*;  // BindingResult
import org.springframework.web.bind.annotation.*;  // RequestMapping  RequestMethod

import com.example.model.Account;

@Controller
@RequestMapping("account")
public class AccountController {

		@RequestMapping(value = "register", method = RequestMethod.GET)
		public String register(ModelMap modelMap) {
			modelMap.put("account", new Account());
			return "account/register";
		}
		
		@RequestMapping(value = "register", method = RequestMethod.POST)
		public String register(
				@ModelAttribute("account") @Valid Account account,
				BindingResult bindingResult,
				ModelMap modelMap) {
			if(bindingResult.hasErrors()) {
				modelMap.put("account", account);
				return "account/register";
			} else {
				modelMap.put("account", account);
				return "account/success";
			}
		}
}
