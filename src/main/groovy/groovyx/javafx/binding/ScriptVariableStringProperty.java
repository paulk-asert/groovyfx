/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * Copyright 2011-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package groovyx.javafx.binding;

import groovy.lang.Script;
import javafx.beans.property.SimpleStringProperty;

/**
 * Wraps a groovy script variable in a JavaFX Property
 * 
 * @author jimclarke
 */
public class ScriptVariableStringProperty extends SimpleStringProperty{
    
    ScriptVariableStringProperty(Script script, String propertyName) {
        super(script, propertyName, (String)script.getProperty(propertyName));
    }

    @Override
    public void set(String newValue) {
        ((Script)getBean()).setProperty(getName(), newValue);
        super.set(newValue);
    }
}
