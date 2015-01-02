/*
 * Copyright (c) 2015 GraphAware
 *
 * This file is part of GraphAware.
 *
 * GraphAware is free software: you can redistribute it and/or modify it under the terms of
 * the GNU General Public License as published by the Free Software Foundation, either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 *  without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details. You should have received a copy of
 * the GNU General Public License along with this program.  If not, see
 * <http://www.gnu.org/licenses/>.
 */

package com.graphaware.reco.neo4j.engine;

import com.graphaware.reco.generic.engine.TopLevelDelegatingRecommendationEngine;
import com.graphaware.reco.neo4j.context.Neo4jContextFactory;
import org.neo4j.graphdb.Node;

/**
 * A Neo4j {@link TopLevelDelegatingRecommendationEngine} where both the input to the
 * recommendation-computing process and the produced recommendations are {@link org.neo4j.graphdb.Node}s.
 * <p/>
 * Uses {@link com.graphaware.reco.neo4j.context.Neo4jContextFactory}.
 */
public class Neo4jTopLevelDelegatingEngine extends TopLevelDelegatingRecommendationEngine<Node, Node> {

    public Neo4jTopLevelDelegatingEngine(Neo4jContextFactory contextFactory) {
        super(contextFactory);
    }
}