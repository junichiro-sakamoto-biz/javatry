/*
 * Copyright 2019-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.docksidestage.bizfw.basic.objanimal.think;

import org.docksidestage.bizfw.basic.objanimal.Animal;
//import org.docksidestage.bizfw.basic.objanimal.think.Thinker;

/**
 * The object for alarm clock(目覚まし時計).
 * @author jflute
 */
public class Human extends Animal implements Thinker {

    @Override
    public String think() {
        return "Hmm...";
    }

    @Override
    protected String getBarkWord() {
        return "Hello world";
    }
}
