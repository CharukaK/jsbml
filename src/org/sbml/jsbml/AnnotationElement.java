/*
 * $Id$
 * $URL$
 *
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
package org.sbml.jsbml;

import org.sbml.jsbml.util.TreeNodeChangeListener;

/**
 * A common super class for all those elements that can be part of an {@link Annotation}.
 * 
 * @author Andreas Dr&auml;ger
 * @version $Rev$
 * @since 0.8
 * @date 08.07.2011
 */
public abstract class AnnotationElement extends AbstractTreeNode {

	/**
	 * Generated serial version identifier.
	 */
	private static final long serialVersionUID = 495755171215798027L;
	
	/**
	 * Creates a new empty {@link AnnotationElement} without any children, an
	 * empty list of {@link TreeNodeChangeListener}s, and a parent that is
	 * {@code null}.
	 */
	public AnnotationElement() {
		super();
	}
	
	/**
	 * Clone constructor.
	 * 
	 * @param annotation
	 */
	public AnnotationElement(AnnotationElement annotation) {
		super(annotation);
	}

}
