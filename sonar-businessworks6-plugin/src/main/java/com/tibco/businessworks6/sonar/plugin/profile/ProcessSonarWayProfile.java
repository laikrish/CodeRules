/*
 * SonarQube Java
 * Copyright (C) 2012 SonarSource
 * dev@sonar.codehaus.org
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package com.tibco.businessworks6.sonar.plugin.profile;

import org.sonar.api.profiles.AnnotationProfileParser;
import org.sonar.api.profiles.ProfileDefinition;
import org.sonar.api.profiles.RulesProfile;
import org.sonar.api.utils.ValidationMessages;

import com.tibco.businessworks6.sonar.plugin.language.ProcessLanguage;
import com.tibco.businessworks6.sonar.plugin.rulerepository.ProcessRuleDefinition;

public class ProcessSonarWayProfile extends ProfileDefinition {

	  private final AnnotationProfileParser annotationProfileParser;
	  public static final String defaultProfileName = "Sonar way";
	  public ProcessSonarWayProfile(AnnotationProfileParser annotationProfileParser) {
	    this.annotationProfileParser = annotationProfileParser;
	  }

	  @Override
	  public RulesProfile createProfile(ValidationMessages messages) {
	    return annotationProfileParser.parse(ProcessRuleDefinition.REPOSITORY_KEY, defaultProfileName, ProcessLanguage.KEY, ProcessRuleDefinition.checkRules, messages);
	  }

}
