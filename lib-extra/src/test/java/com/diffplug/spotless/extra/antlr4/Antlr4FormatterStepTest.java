/*
 * Copyright 2016 DiffPlug
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
package com.diffplug.spotless.extra.antlr4;

import org.junit.Test;

import com.diffplug.spotless.FormatterStep;
import com.diffplug.spotless.ResourceHarness;

public class Antlr4FormatterStepTest extends ResourceHarness {

	@Test
	public void sortImportsFromArray() throws Throwable {
		FormatterStep step = Antlr4FormatterStep.create();
		assertOnResources(step, "antlr4/Hello.unformatted.g4", "antlr4/Hello.formatted.g4");
	}

}
