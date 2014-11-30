package com.IndexPage.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.IndexPage.model.Account;



/**
 * 
 * @author huangyuan
 *
 */
@Repository
@Transactional
public class AccountDAOImpl implements AccountDAO{
	
	@Autowired
	private EntityManager em;

	@Override
	public Account FindByID(Long ID) {
		return em.find(Account.class, ID);
	}

	@Override
	public List<Account> findAllOrderedByName() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Account> criteria = cb.createQuery(Account.class);
        Root<Account> account = criteria.from(Account.class);
        criteria.select(account).orderBy(cb.asc(account.get("UserName")));
        return em.createQuery(criteria).getResultList();
	}

	@Override
	public void register(Account account) {
		em.persist(account);
        return;
	}

	@Override
	public List<Account> FindByName(String UserName) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Account> criteria = cb.createQuery(Account.class);
        Root<Account> account = criteria.from(Account.class);
        Predicate condition=cb.equal(account.get("UserName"), UserName);
        criteria.select(account).where(condition);
		return em.createQuery(criteria).getResultList();
	}

	@Override
	public List<Account> FindByEmail(String Email) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Account> criteria = cb.createQuery(Account.class);
        Root<Account> account = criteria.from(Account.class);
        Predicate condition=cb.equal(account.get("Email"), Email);
        criteria.select(account).where(condition);
		return  em.createQuery(criteria).getResultList();
	}

	@Override
	public List<Account> Login(String UserName, String Password) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Account> criteria = cb.createQuery(Account.class);
        Root<Account> account = criteria.from(Account.class);
        Predicate condition=cb.and(cb.equal(account.get("UserName"), UserName),cb.equal(account.get("Password"), Password));
        criteria.select(account).where(condition);
		return  em.createQuery(criteria).getResultList();
	}

}
