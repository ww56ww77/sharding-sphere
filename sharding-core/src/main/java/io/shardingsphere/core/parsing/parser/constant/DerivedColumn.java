/*
 * Copyright 2016-2018 shardingsphere.io.
 * <p>
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
 * </p>
 */

package io.shardingsphere.core.parsing.parser.constant;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * Derived column alias.
 *
 * @author zhangliang
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class DerivedColumn {
    
    private static final String AVG_COUNT_ALIAS = "AVG_DERIVED_COUNT_";
    
    private static final String AVG_SUM_ALIAS = "AVG_DERIVED_SUM_";
    
    private static final String ORDER_BY_ALIAS = "ORDER_BY_DERIVED_";
    
    private static final String GROUP_BY_ALIAS = "GROUP_BY_DERIVED_";
    
    /**
     * Get alias of avg derived count column.
     * 
     * @param derivedColumnCount derived column count
     * @return alias of avg derived count column
     */
    public static String getDerivedAvgCountAlias(final int derivedColumnCount) {
        return String.format(AVG_COUNT_ALIAS + "%s", derivedColumnCount);
    }
    
    /**
     * Get alias of avg derived sum column.
     *
     * @param derivedColumnCount derived column count
     * @return alias of avg derived sum column
     */
    public static String getDerivedAvgSumAlias(final int derivedColumnCount) {
        return String.format(AVG_SUM_ALIAS + "%s", derivedColumnCount);
    }
    
    /**
     * Get alias of order by derived column.
     *
     * @param derivedColumnCount derived column count
     * @return alias of order by derived column
     */
    public static String getDerivedOrderByAlias(final int derivedColumnCount) {
        return String.format(ORDER_BY_ALIAS + "%s", derivedColumnCount);
    }
    
    /**
     * Get alias of group by derived column.
     *
     * @param derivedColumnCount derived column count
     * @return alias of group by derived column
     */
    public static String getDerivedGroupByAlias(final int derivedColumnCount) {
        return String.format(GROUP_BY_ALIAS + "%s", derivedColumnCount);
    }
    
    /**
     * Judge is derived column or not.
     * 
     * @param columnName column name to be judged
     * @return is derived column or not
     */
    public static boolean isDerivedColumn(final String columnName) {
        return columnName.startsWith(DerivedColumn.AVG_COUNT_ALIAS) || columnName.startsWith(DerivedColumn.AVG_SUM_ALIAS)
                || columnName.startsWith(DerivedColumn.ORDER_BY_ALIAS) || columnName.startsWith(DerivedColumn.GROUP_BY_ALIAS);
    }
}
