package org.socialsignin.springsocial.security.signup;
/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
import org.socialsignin.springsocial.security.api.SpringSocialProfile;
import org.springframework.stereotype.Service;

/**
 * Default implementation of <code>AbstractSpringSocialSecurityConnectionSignUp</code> which can be used
 * in conjunction with <code>SpringSocialSecurityProfileFactory</code> and an implementation of 
 * <code>SpringSocialSecuritySignUpService</code> to implicitly sign up users with minimal SpringSocialProfile data.
 * 
 * @author Michael Lavelle
 */
@Service
public class SpringSocialSecurityConnectionSignUp extends
		AbstractSpringSocialSecurityConnectionSignUp<
		SpringSocialProfile, SpringSocialSecuritySignUpService,SpringSocialSecurityProfileFactory> {
}
