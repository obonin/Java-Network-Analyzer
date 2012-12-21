/**
 * GraphHopper-SNA implements a collection of social network analysis
 * algorithms. It is based on the <a
 * href="http://graphhopper.com/">GraphHopper</a> library.
 *
 * GraphHopper-SNA is distributed under the GPL 3 license. It is produced by the
 * "Atelier SIG" team of the <a href="http://www.irstv.fr">IRSTV Institute</a>,
 * CNRS FR 2488.
 *
 * Copyright 2012 IRSTV (CNRS FR 2488)
 *
 * GraphHopper-SNA is free software: you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 *
 * GraphHopper-SNA is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * GraphHopper-SNA. If not, see <http://www.gnu.org/licenses/>.
 */
package com.graphhopper.sna.centrality;

import com.graphhopper.sna.data.PathLengthData;
import com.graphhopper.storage.Graph;
import gnu.trove.map.hash.TIntDoubleHashMap;

/**
 * Calculates various centrality measures on a weighted graph.
 *
 * @author Adam Gouge
 */
// TODO: Implement betweenness centrality.
public class WeightedGraphAnalyzer extends GraphAnalyzer {

    /**
     * Initializes a new instance of a weighted graph analyzer.
     *
     * @param graph The graph to be analyzed.
     */
    public WeightedGraphAnalyzer(Graph graph) {
        super(graph);
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public TIntDoubleHashMap computeCloseness() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Computes the shortest path lengths from the given node to all other nodes
     * in the weighted graph and stores them in a
     * {@link PathLengthData} object.
     *
     * <p> 
     * 
     * in order to find all reachable nodes
     * and accumulate their distances.
     *
     * @param startNode Start node of the shortest paths to be found.
     *
     * @return Data on the shortest path lengths from the current node to all
     *         other reachable nodes in the graph.
     */
    @Override
    protected PathLengthData computeShortestPathsData(int startNode) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}