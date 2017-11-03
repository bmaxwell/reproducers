package org.wildfly.test;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="Entity1")
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Entity1 extends AbstractEntity implements Serializable {

	private int id;
	private String name;

	@GeneratedValue @Id
	public int getId() {
		return id;
	}

	public void setId(int it) {
		this.id = id;
	}


  @Column(name="name")
  public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
