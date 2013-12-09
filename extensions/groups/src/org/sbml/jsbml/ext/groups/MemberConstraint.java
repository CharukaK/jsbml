/*
 * $Id$
 * $URL$
 * ----------------------------------------------------------------------------
 * This file is part of JSBML. Please visit <http://sbml.org/Software/JSBML>
 * for the latest version of JSBML and more information about SBML.
 *
 * Copyright (C) 2009-2013 jointly by the following organizations:
 * 1. The University of Tuebingen, Germany
 * 2. EMBL European Bioinformatics Institute (EBML-EBI), Hinxton, UK
 * 3. The California Institute of Technology, Pasadena, CA, USA
 * 4. The University of California, San Diego, La Jolla, CA, USA
 * 
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation. A copy of the license agreement is provided
 * in the file named "LICENSE.txt" included with this software distribution
 * and also available online as <http://sbml.org/Software/JSBML/License>.
 * ----------------------------------------------------------------------------
 */
package org.sbml.jsbml.ext.groups;

import java.util.Map;

import org.sbml.jsbml.AbstractNamedSBase;
import org.sbml.jsbml.LevelVersionError;

/**
 * 
 * @author Nicolas Rodriguez
 * @version $Rev$
 * @since 1.0
 * @date 2013-11-18
 */
public class MemberConstraint extends AbstractNamedSBase {

  /**
   * Generated serial version identifier.
   */
  private static final long serialVersionUID = -5785868406244137379L;

  private String identicalAttribute;
  private String distinctAttribute;

  /**
   * Creates an MemberConstraint instance
   */
  public MemberConstraint() {
    super();
    initDefaults();
  }

  /**
   * Creates a MemberConstraint instance with an id.
   * 
   * @param id
   */
  public MemberConstraint(String id) {
    super(id);
    initDefaults();
  }

  /**
   * Creates a MemberConstraint instance with a level and version.
   * 
   * @param level
   * @param version
   */
  public MemberConstraint(int level, int version) {
    this(null, null, level, version);
  }

  /**
   * Creates a MemberConstraint instance with an id, level, and version.
   * 
   * @param id
   * @param level
   * @param version
   */
  public MemberConstraint(String id, int level, int version) {
    this(id, null, level, version);
  }

  /**
   * Creates a MemberConstraint instance with an id, name, level, and version.
   * 
   * @param id
   * @param name
   * @param level
   * @param version
   */
  public MemberConstraint(String id, String name, int level, int version) {
    super(id, name, level, version);
    if (getLevelAndVersion().compareTo(
      Integer.valueOf(GroupsConstants.MIN_SBML_LEVEL),
      Integer.valueOf(GroupsConstants.MIN_SBML_VERSION)) < 0) {
      throw new LevelVersionError(getElementName(), level, version);
    }
    initDefaults();
  }

  /**
   * Clone constructor
   */
  public MemberConstraint(MemberConstraint obj) {
    super(obj);

    if (obj.isSetIdenticalAttribute()) {
      setIdenticalAttribute(obj.getIdenticalAttribute());
    }
    if (obj.isSetDistinctAttribute()) {
      setDistinctAttribute(obj.getDistinctAttribute());
    }
  }

  /* (non-Javadoc)
   * @see org.sbml.jsbml.AbstractSBase#clone()
   */
  @Override
  public MemberConstraint clone() {
    return new MemberConstraint(this);
  }

  /**
   * Initializes the default values using the namespace.
   */
  public void initDefaults() {
    addNamespace(GroupsConstants.namespaceURI);
  }

  /* (non-Javadoc)
   * @see org.sbml.jsbml.NamedSBase#isIdMandatory()
   */
  @Override
  public boolean isIdMandatory() {
    return false;
  }

  /**
   * Returns the value of identicalAttribute
   *
   * @return the value of identicalAttribute
   */
  public String getIdenticalAttribute() {
    if (isSetIdenticalAttribute()) {
      return identicalAttribute;
    }

    return null;
  }

  /**
   * Returns whether identicalAttribute is set
   *
   * @return whether identicalAttribute is set
   */
  public boolean isSetIdenticalAttribute() {
    return this.identicalAttribute != null;
  }

  /**
   * Sets the value of identicalAttribute
   */
  public void setIdenticalAttribute(String identicalAttribute) {
    String oldIdenticalAttribute = this.identicalAttribute;
    this.identicalAttribute = identicalAttribute;
    firePropertyChange(GroupsConstants.identicalAttribute, oldIdenticalAttribute, this.identicalAttribute);
  }

  /**
   * Unsets the variable identicalAttribute
   *
   * @return {@code true}, if identicalAttribute was set before,
   *         otherwise {@code false}
   */
  public boolean unsetIdenticalAttribute() {
    if (isSetIdenticalAttribute()) {
      String oldIdenticalAttribute = this.identicalAttribute;
      this.identicalAttribute = null;
      firePropertyChange(GroupsConstants.identicalAttribute, oldIdenticalAttribute, this.identicalAttribute);
      return true;
    }
    return false;
  }

  /**
   * Returns the value of distinctAttribute
   *
   * @return the value of distinctAttribute
   */
  public String getDistinctAttribute() {
    if (isSetDistinctAttribute()) {
      return distinctAttribute;
    }

    return null;
  }

  /**
   * Returns whether distinctAttribute is set
   *
   * @return whether distinctAttribute is set
   */
  public boolean isSetDistinctAttribute() {
    return this.distinctAttribute != null;
  }

  /**
   * Sets the value of distinctAttribute
   */
  public void setDistinctAttribute(String distinctAttribute) {
    String oldDistinctAttribute = this.distinctAttribute;
    this.distinctAttribute = distinctAttribute;
    firePropertyChange(GroupsConstants.distinctAttribute, oldDistinctAttribute, this.distinctAttribute);
  }

  /**
   * Unsets the variable distinctAttribute
   *
   * @return {@code true}, if distinctAttribute was set before,
   *         otherwise {@code false}
   */
  public boolean unsetDistinctAttribute() {
    if (isSetDistinctAttribute()) {
      String oldDistinctAttribute = this.distinctAttribute;
      this.distinctAttribute = null;
      firePropertyChange(GroupsConstants.distinctAttribute, oldDistinctAttribute, this.distinctAttribute);
      return true;
    }
    return false;
  }

  /* (non-Javadoc)
   * @see org.sbml.jsbml.AbstractNamedSBase#writeXMLAttributes()
   */
  @Override
  public Map<String, String> writeXMLAttributes() {
    Map<String, String> attributes = super.writeXMLAttributes();

    if (isSetId()) {
      attributes.remove("id");
      attributes.put(GroupsConstants.shortLabel + ":id", getId());
    }
    if (isSetName()) {
      attributes.remove("name");
      attributes.put(GroupsConstants.shortLabel + ":name", getName());
    }
    if (isSetIdenticalAttribute()) {
      attributes.put(GroupsConstants.shortLabel + ":" + GroupsConstants.identicalAttribute, getIdenticalAttribute());
    }
    if (isSetDistinctAttribute()) {
      attributes.put(GroupsConstants.shortLabel + ":" + GroupsConstants.distinctAttribute, getDistinctAttribute());
    }

    return attributes;
  }

  /* (non-Javadoc)
   * @see org.sbml.jsbml.AbstractNamedSBase#readAttribute(java.lang.String, java.lang.String, java.lang.String)
   */
  @Override
  public boolean readAttribute(String attributeName, String prefix, String value) {

    boolean isAttributeRead = super.readAttribute(attributeName, prefix, value);

    if (!isAttributeRead) {
      isAttributeRead = true;

      if (attributeName.equals(GroupsConstants.identicalAttribute)) {
        setIdenticalAttribute(value);
      } else if (attributeName.equals(GroupsConstants.distinctAttribute)) {
        setDistinctAttribute(value);
      } else {
        isAttributeRead = false;
      }
    }

    return isAttributeRead;
  }

}