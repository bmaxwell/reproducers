package org.wildfly.test;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class StatelessBean2 {

	@PersistenceContext(unitName="pu2")
	protected EntityManager em;

}
