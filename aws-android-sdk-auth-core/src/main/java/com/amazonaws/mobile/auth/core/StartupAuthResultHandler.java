/*
  * Copyright 2013-2017 Amazon.com, Inc. or its affiliates.
  * All Rights Reserved.
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

package com.amazonaws.mobile.auth.core;

/**
 * Interface for calling IdentityManager's doStartupAuth().
 */
public interface StartupAuthResultHandler {
    /**
     * Called when the startup auth flow is complete.
     * For Optional Sign-in one of the following occurred:
     * 1. No identity was obtained.
     * 2. An unauthenticated (guest) identity was obtained.
     * 3. An authenticated identity was obtained (using an identity provider).
     *
     * @param authResults the StartupAuthResult object containing the results for doStartupAuth().
     */
    void onComplete(StartupAuthResult authResults);
}
