/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.carbon.event.simulator.core.internal.util;


/**
 * constants related to Event Simulator
 */
public class EventSimulatorConstants {
    public static final String DIRECTORY_CSV_FILES = "csv-files";
    public static final String DIRECTORY_SIMULATION_CONFIGS = "simulation-configs";
    public static final String DIRECTORY_DEPLOYMENT = "deployment";

    public static final String SIMULATION_FILE_EXTENSION = "json";
    public static final String CSV_FILE_EXTENSION = "csv";
    public static final String TEMP_FILE_EXTENSION = "temp";

    public static final String EVENT_SIMULATION_PROPERTIES = "properties";
    public static final String EVENT_SIMULATION_NAME = "simulationName";
    public static final String EVENT_SIMULATION_DESCRIPTION = "description";
    public static final String EVENT_SIMULATION_SOURCES = "sources";
    public static final String START_TIMESTAMP = "startTimestamp";
    public static final String END_TIMESTAMP = "endTimestamp";
    public static final String SIMULATION_TIME_INTERVAL = "timeInterval";
    public static final String NUMBER_OF_EVENTS_REQUIRED = "noOfEvents";

    public static final String JSON_CONFIGURATION_RESOURCE_NAME = "JSON configuration";
    public static final String PROPERTIES_RESOURCE_NAME = "properties";


    //Feed Simulation stream Configuration constants

    //SingleEventSimulation constants
    public static final String SINGLE_EVENT_TIMESTAMP = "timestamp";
    public static final String SINGLE_EVENT_DATA = "data";

    // source configuration constants
    public static final String EVENT_SIMULATION_TYPE = "simulationType";
    public static final String STREAM_NAME = "streamName";
    public static final String EXECUTION_PLAN_NAME = "siddhiAppName";
    public static final String TIMESTAMP_ATTRIBUTE = "timestampAttribute";
    public static final String TIMESTAMP_INTERVAL = "timestampInterval";

    //CSV simulation constants
    public static final String FILE_NAME = "fileName";
    public static final String DELIMITER = "delimiter";
    public static final String IS_ORDERED = "isOrdered";
    public static final String INDICES = "indices";


    //Random data simulation constants
    public static final String ATTRIBUTE_CONFIGURATION = "attributeConfiguration";
    public static final String RANDOM_DATA_GENERATOR_TYPE = "type";
    public static final String CUSTOM_DATA_BASED_ATTRIBUTE_LIST = "list";
    public static final String PRIMITIVE_BASED_ATTRIBUTE_MIN = "min";
    public static final String PRIMITIVE_BASED_ATTRIBUTE_MAX = "max";
    public static final String PRIMITIVE_BASED_ATTRIBUTE_LENGTH = "length";
    public static final String PRIMITIVE_BASED_ATTRIBUTE_PRECISION = "precision";
    public static final String PROPERTY_BASED_ATTRIBUTE_PROPERTY = "property";
    public static final String REGEX_BASED_ATTRIBUTE_PATTERN = "pattern";

    //    Database simulation constants
    public static final String DRIVER = "driver";
    public static final String DATA_SOURCE_LOCATION = "dataSourceLocation";
    public static final String USER_NAME = "username";
    public static final String PASSWORD = "password";
    public static final String TABLE_NAME = "tableName";
    public static final String COLUMN_NAMES_LIST = "columnNamesList";
}
