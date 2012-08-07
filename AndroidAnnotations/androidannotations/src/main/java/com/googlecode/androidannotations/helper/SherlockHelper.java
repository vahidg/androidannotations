/**
 * Copyright (C) 2010-2012 eBusiness Information, Excilys Group
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed To in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.googlecode.androidannotations.helper;

import java.util.Iterator;

import javax.lang.model.element.TypeElement;

import com.googlecode.androidannotations.processing.EBeanHolder;
import com.sun.codemodel.JPackage;

/**
 * @author Eric Kok
 */
public class SherlockHelper {

	/**
	 * The name 'root' package in the ActionBarSherlock library that contains
	 * Fragment and Activity types, e.g. <tt>SherlockActivity</tt>
	 */
	public static final String SHERLOCK_ROOT_PACKAGE = "com.actionbarsherlock.app";
	private final AnnotationHelper annotationHelper;

	public SherlockHelper(AnnotationHelper annotationHelper) {
		this.annotationHelper = annotationHelper;
	}

	/**
	 * Checks whether the Activity extends one of the ActionBarSherlock Activity
	 * types
	 */
	public boolean usesSherlock(EBeanHolder holder) {
		TypeElement typeElement = annotationHelper.typeElementFromQualifiedName(holder.eBean._extends().fullName());
		Iterator<JPackage> packageIterator = holder.codeModel().packages();
		return annotationHelper.isSubtypeOfPackage(typeElement, SHERLOCK_ROOT_PACKAGE, packageIterator);
	}
}
