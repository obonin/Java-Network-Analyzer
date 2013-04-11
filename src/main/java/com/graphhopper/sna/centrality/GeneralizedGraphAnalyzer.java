/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.graphhopper.sna.centrality;

import com.graphhopper.sna.progress.ProgressMonitor;
import java.util.Set;
import org.jgrapht.DirectedGraph;
import org.jgrapht.Graph;
import org.jgrapht.UndirectedGraph;

/**
 * Root class of all classes that do some type of analysis on graphs
 * (centrality, connectedness, etc.).
 *
 * @author Adam Gouge
 */
public abstract class GeneralizedGraphAnalyzer<V, E> {

    /**
     * The graph to be analyzed.
     */
    protected final Graph<V, E> graph;
    /**
     * The set of nodes of this graph.
     */
    protected final Set<V> nodeSet;
    /**
     * The number of nodes in this graph.
     */
    protected final int nodeCount;

    /**
     * Initializes a new instance of a graph analyzer with the given
     * {@link ProgressMonitor}.
     *
     * @param graph The graph to be analyzed.
     * @param pm    The {@link ProgressMonitor} to be used.
     */
    public GeneralizedGraphAnalyzer(Graph<V, E> graph) {
        this.graph = graph;
        this.nodeSet = graph.vertexSet();
        this.nodeCount = this.nodeSet.size();
    }

    /**
     * Returns the outdegree (or degree) of the given node.
     *
     * @param graph The graph.
     * @param node  The node.
     *
     * @return
     */
    // 
    public static int outdegree(Graph graph, Object node) {
        if (graph instanceof DirectedGraph) {
            return ((DirectedGraph) graph).outDegreeOf(node);
        } else if (graph instanceof UndirectedGraph) {
            return ((UndirectedGraph) graph).degreeOf(node);
        }
        return -1;
    }
}