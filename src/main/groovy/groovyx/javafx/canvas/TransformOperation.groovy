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
package groovyx.javafx.canvas

import groovyx.javafx.beans.FXBindable
import javafx.scene.canvas.GraphicsContext
import javafx.scene.transform.Affine

/**
 *
 * @author jimclarke
 */
@FXBindable
class TransformOperation implements CanvasOperation {
    double mxx
    double myx
    double mxy
    double myy
    double mxt
    double myt
    Affine xform
    
    public void initParams(Object val) {
        if(val instanceof Affine) {
            xform = val
        }else {
            mxx = val[0]
            myx = val[1]
            mxy = val[2]
            myy = val[3]
            mxt = val[4]
            myt = val[5]
        }
    }

    public void execute(GraphicsContext gc) {
        if(xform != null)
            gc.transform(xform)
        else
            gc.transform(mxx, myx, mxy, myy, mxt, myt);
    }
}

