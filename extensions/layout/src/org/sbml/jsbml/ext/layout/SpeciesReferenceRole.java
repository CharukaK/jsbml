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
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation. A copy of the license agreement is provided
 * in the file named "LICENSE.txt" included with this software distribution
 * and also available online as <http://sbml.org/Software/JSBML/License>.
 * ----------------------------------------------------------------------------
 */
package org.sbml.jsbml.ext.layout;

/**
 * @author Nicolas Rodriguez
 * @author Andreas Dr&auml;ger
 * @since 1.0
 * @version $Rev$
 */
public enum SpeciesReferenceRole {
	/**
	 * 
	 */
	ACTIVATOR,
	/**
	 * 
	 */
	INHIBITOR,
	/**
	 * 
	 */
	MODIFIER,
	/**
	 * 
	 */
	PRODUCT,
	/**
	 * 
	 */
	SIDEPRODUCT,
	/**
	 * 
	 */
	SIDESUBSTRATE,
	/**
	 * 
	 */
	SUBSTRATE,
	/**
	 * 
	 */
	UNDEFINED;
	
	/**
	 * 
	 * @return
	 */
	public int getCorrespondingSBOTerm() {
		switch (this) {
		case ACTIVATOR:
			return 459; // stimulator
		case INHIBITOR:
			return 20; // inhibitor
		case MODIFIER:
			return 19; // modifier
		case PRODUCT:
			return 11; // product
		case SIDEPRODUCT:
			return -1; // ??
		case SIDESUBSTRATE:
			return -1; // ??
		case SUBSTRATE:
			return 10; // reactant
		case UNDEFINED:
			return 3; // participant role
		default:
			return -1; // invalid
		}
	}

}
