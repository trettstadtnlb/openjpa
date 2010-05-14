/*
 * Copyright 2010-2012 Pinaki Poddar
 *
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
*/
package jpa.tools.swing;

import javax.swing.JTable;


import org.apache.openjpa.persistence.OpenJPAEntityManagerFactory;
import org.apache.openjpa.persistence.OpenJPAEntityManagerFactorySPI;

/**
 * A specialized table to display statistics of queries.
 * 
 * @author Pinaki Poddar
 *
 */
@SuppressWarnings("serial")
public class PreparedQueryViewer extends JTable {
    
    public PreparedQueryViewer(OpenJPAEntityManagerFactory emf) {
        super(new QueryStatisticsModel(((OpenJPAEntityManagerFactorySPI)emf).getConfiguration()
                .getQuerySQLCacheInstance().getStatistics()));
    }

}
