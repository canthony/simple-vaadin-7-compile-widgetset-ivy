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

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.client.ui.AbstractComponentConnector;
import com.vaadin.shared.ui.Connect;

/**
 * A Trivial connector, to explore compiling WidgetSets
 *
 * From https://vaadin.com/wiki/-/wiki/Main/Creating%20a%20simple%20component
 */
@Connect(com.example.mycomponent.MyComponent.class)
public class MyComponentConnector extends AbstractComponentConnector {

  @Override
  public MyComponentWidget getWidget() {
    return (MyComponentWidget) super.getWidget();
  }

  @Override
  protected Widget createWidget() {
    return GWT.create(MyComponentWidget.class);
  }
}
