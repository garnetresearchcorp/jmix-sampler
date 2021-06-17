/*
 * Copyright 2021 Haulmont.
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

package io.jmix.sampler.screen.entity.producttag;

import io.jmix.ui.screen.*;
import io.jmix.sampler.entity.ProductTag;

@UiController("ProductTag.browse")
@UiDescriptor("product-tag-browse.xml")
@LookupComponent("productTagsTable")
public class ProductTagBrowse extends StandardLookup<ProductTag> {
}