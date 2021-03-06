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
package com.googlecode.androidannotations.test15.efragment;

import com.googlecode.androidannotations.annotations.EBean;
import com.googlecode.androidannotations.annotations.FragmentById;
import com.googlecode.androidannotations.annotations.FragmentByTag;
import com.googlecode.androidannotations.test15.R;

@EBean
public class BeanWithFragments {

	@FragmentById
	public MyFragment myFragment;
	
	@FragmentById
	public MySupportFragment mySupportFragment;

	@FragmentById(R.id.myFragment)
	public MyFragment myFragment2;

	@FragmentById(R.id.mySupportFragment)
	public MySupportFragment mySupportFragment2;
	
	@FragmentByTag
	public MyFragment myFragmentTag;
	
	@FragmentByTag
	public MySupportFragment mySupportFragmentTag;
	
	@FragmentByTag("myFragmentTag")
	public MyFragment myFragmentTag2;
	
	@FragmentByTag("mySupportFragmentTag")
	public MySupportFragment mySupportFragmentTag2;
	
	
	
}
