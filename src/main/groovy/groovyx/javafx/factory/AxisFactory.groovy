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
package groovyx.javafx.factory

import javafx.scene.chart.Axis
// import javafx.scene.chart.XYChartBuilder

/**
 * A factory for creating ValueAxis and CategoryAxis objects for XYCharts.
 *
 * @author Dean Iverson
 */
class AxisFactory extends AbstractNodeFactory {
    private static final String X_AXIS_PROPERTY = '__xAxis'

    AxisFactory(Class<? extends Axis> axisClass) {
        super(axisClass, true);
    }

    @Override
    void setParent(FactoryBuilderSupport builder, Object parent, Object child) {
        /*
        if (parent instanceof XYChartBuilder) {
            if (!builder.context.containsKey(X_AXIS_PROPERTY)) {
                builder.context[X_AXIS_PROPERTY] = true
                parent.XAxis(child)
            } else {
                parent.YAxis(child)
            }
        }
        */
    }
}
