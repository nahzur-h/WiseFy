/*
 * Copyright 2019 Patches Klinefelter
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.isupatches.wisefysample.internal.util

import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

/**
 * A classed used to provide appropriate Rx schedulers for both production and tests
 */
open class RxSchedulersProvider @Inject constructor() {

    /**
     * The UI/main thread for Rx subscriptions to use
     */
    open val main: Scheduler by lazy { AndroidSchedulers.mainThread() }

    /**
     * The background thread for Rx subscriptions to use
     */
    open val io: Scheduler by lazy { Schedulers.io() }
}
