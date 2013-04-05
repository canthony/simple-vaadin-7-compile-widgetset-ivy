/*
 * Copyright 2013 HPD Software Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.example.mycomponent.client;

import com.google.gwt.user.client.ui.Label;

/**
 * A Trivial widget, to explore compiling WidgetSets
 *
 * From https://vaadin.com/wiki/-/wiki/Main/Creating%20a%20simple%20component
 */

public class MyComponentWidget extends Label {

  public static final String CLASSNAME = "mycomponent";

  public MyComponentWidget() {
    setText("This is MyComponent");
    setStyleName(CLASSNAME);
  }
}

