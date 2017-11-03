package org.wildfly.test;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class StatelessBean1 {

	@PersistenceContext(unitName="pu1")
	protected EntityManager em;

}
