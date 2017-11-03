package org.wildfly.test;

import java.io.Serializable;

public abstract class AbstractEntity implements Serializable {

   public String toString() {
		 return this.getClass().getName() + " " + this;
	 }

}
