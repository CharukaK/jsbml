/*
 * $Id$
 * $URL$
 * ----------------------------------------------------------------------------
 * This file is part of JSBML. Please visit <http://sbml.org/Software/JSBML>
 * for the latest version of JSBML and more information about SBML.
 *
 * Copyright (C) 2009-2015 jointly by the following organizations:
 * 1. The University of Tuebingen, Germany
 * 2. EMBL European Bioinformatics Institute (EBML-EBI), Hinxton, UK
 * 3. The California Institute of Technology, Pasadena, CA, USA
 * 4. The University of California, San Diego, La Jolla, CA, USA
 * 5. The Babraham Institute, Cambridge, UK
 * 
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation. A copy of the license agreement is provided
 * in the file named "LICENSE.txt" included with this software distribution
 * and also available online as <http://sbml.org/Software/JSBML/License>.
 * ----------------------------------------------------------------------------
 */
package org.sbml.jsbml.ext.multi;

import java.util.Map;

import javax.swing.tree.TreeNode;

import org.sbml.jsbml.ListOf;
import org.sbml.jsbml.Species;
import org.sbml.jsbml.ext.AbstractSBasePlugin;

/**
 * 
 * @author Nicolas Rodriguez
 * @version $Rev$
 * @since 1.0
 * @date 16.10.2013
 */
public class MultiSpeciesReferencePlugin extends AbstractSBasePlugin {


  /* (non-Javadoc)
   * @see org.sbml.jsbml.ext.SBasePlugin#getElementNamespace()
   */
  @Override
  public String getElementNamespace() {
    return MultiConstants.getNamespaceURI(getLevel(), getVersion());
  }


  /* (non-Javadoc)
   * @see org.sbml.jsbml.ext.SBasePlugin#getPackageName()
   */
  @Override
  public String getPackageName() {
    return MultiConstants.packageName;
  }


  /* (non-Javadoc)
   * @see org.sbml.jsbml.ext.SBasePlugin#getPrefix()
   */
  @Override
  public String getPrefix() {
    return MultiConstants.shortLabel;
  }


  /* (non-Javadoc)
   * @see org.sbml.jsbml.ext.SBasePlugin#getURI()
   */
  @Override
  public String getURI() {
    return getElementNamespace();
  }


  /* (non-Javadoc)
   * @see org.sbml.jsbml.AbstractTreeNode#getParent()
   */
  @SuppressWarnings("unchecked")
  @Override
  public ListOf<Species> getParent() {
    return (ListOf<Species>) getExtendedSBase().getParent();
  }


  /* (non-Javadoc)
   * @see org.sbml.jsbml.ext.AbstractSBasePlugin#getParentSBMLObject()
   */
  @Override
  public ListOf<Species> getParentSBMLObject() {
    return getParent();
  }
  /**
   * Generated serial version identifier.
   */
  private static final long serialVersionUID = 3171952386462646205L;
  /**
   * 
   */
  ListOf<SpeciesTypeRestriction> listOfSpeciesTypeRestrictions;


  /**
   * @param multiSpeciesReference
   */
  public MultiSpeciesReferencePlugin(MultiSpeciesReferencePlugin multiSpeciesReference) {
    super(multiSpeciesReference);
  }

  /**
   * Returns the list of {@link SpeciesTypeRestriction}.
   * 
   * @return the list of {@link SpeciesTypeRestriction}
   */
  public ListOf<SpeciesTypeRestriction> getListOfSpeciesTypeRestrictions() {
    if (listOfSpeciesTypeRestrictions == null) {
      listOfSpeciesTypeRestrictions = new ListOf<SpeciesTypeRestriction>();
    }

    return listOfSpeciesTypeRestrictions;
  }

  /**
   * Adds a {@link SpeciesTypeRestriction}.
   * 
   * @param speciesTypeRestriction the {@link SpeciesTypeRestriction} to add
   */
  public void addSpeciesTypeRestriction(SpeciesTypeRestriction speciesTypeRestriction) {
    getListOfSpeciesTypeRestrictions().add(speciesTypeRestriction);
  }

  @Override
  public boolean readAttribute(String attributeName, String prefix,
    String value) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public TreeNode getChildAt(int childIndex) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public int getChildCount() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public boolean getAllowsChildren() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public Map<String, String> writeXMLAttributes() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public MultiSpeciesReferencePlugin clone() {
    return new MultiSpeciesReferencePlugin(this);
  }

}