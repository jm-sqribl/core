package com.freeform.core.repositories;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.freeform.core.model.Company;
import com.freeform.core.model.User;
import com.freeform.core.service.EntityService;

@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml","classpath:spring/data/jpaContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
//@ActiveProfiles("jpa")
public class JpaRepositoryTests {
	
	@Autowired
	private EntityService<User> userService;
	
	@Autowired
	private EntityService<Company> companyService;
	
	@Test
	public void testViableJpa() {
		
		List<User> users = userService.findAll();
		for(User user : users) {
			System.out.print(user.getFirstName()+","+user.getLastName());//
			if( user.getParentCompany() != null) {
				System.out.println(" parentCompany:"+user.getParentCompany().getCompanyName());
			} else {
				System.out.println("");
			}
		}
		
		List<Company> companies = companyService.findAll();
		for(Company company : companies) {
			System.out.println(company.getCompanyName());
		}
		  
		  /*
		   * 
		  assertThat(page.getContent(), hasSize(1));
		  assertThat(page, Matchers.<Product> hasItems(named("iPad")));
		  assertThat(page.getTotalElements(), is(2L));
		  assertThat(page.isFirstPage(), is(true));
		  assertThat(page.isLastPage(), is(false));
		  assertThat(page.hasNextPage(), is(true));
		  */
	}
}
