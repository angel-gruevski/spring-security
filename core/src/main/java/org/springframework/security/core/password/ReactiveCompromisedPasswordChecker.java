/*
 * Copyright 2002-2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.security.core.password;

import reactor.core.publisher.Mono;

/**
 * A Reactive API for checking if a password has been compromised.
 *
 * @author Marcus da Coregio
 * @since 6.3
 */
public interface ReactiveCompromisedPasswordChecker {

	/**
	 * Check whether the password is compromised
	 * @param password the password to check
	 * @return a {@link Mono} containing the {@link CompromisedPasswordCheckResult}
	 */
	Mono<CompromisedPasswordCheckResult> check(String password);

}
