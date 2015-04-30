/*
 * Copyright 2015 Kevin Liu
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.airk.trigger;

/**
 * Thread space define
 */
public enum ThreadSpace {
    /**
     * Your action will be execute in a ThreadPoll, so you don't
     * need to worry about it will effect the UI thread.
     */
    BACKGROUND,
    /**
     * Your action will be execute in the UI thread, watch out.
     */
    MAIN
}
