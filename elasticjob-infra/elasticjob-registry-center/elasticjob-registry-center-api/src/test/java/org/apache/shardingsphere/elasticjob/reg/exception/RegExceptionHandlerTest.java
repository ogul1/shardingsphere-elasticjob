/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.elasticjob.reg.exception;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public final class RegExceptionHandlerTest {
    
    @Test
    @Disabled
    // TODO throw InterruptedException will cause zookeeper TestingServer break. Ignore first, fix it later.
    public void assertHandleExceptionWithInterruptedException() {
        RegExceptionHandler.handleException(new InterruptedException());
    }
    
    @Test
    public void assertHandleExceptionWithNull() {
        RegExceptionHandler.handleException(null);
    }
    
    @Test
    public void assertHandleExceptionWithOtherException() {
        assertThrows(RegException.class, () -> RegExceptionHandler.handleException(new RuntimeException()));
    }
}
