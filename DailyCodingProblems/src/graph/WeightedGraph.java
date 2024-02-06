package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeightedGraph {
	private class Node {
		private String label;

		private List<Edge> edges = new ArrayList<>();

		public Node(String label) {
			this.label = label;
		}

		@Override
		public String toString() {
			return label;
		}

		public void addEdge(Node to, int weight) {
			edges.add(new Edge(this, to, weight));
		}

		public List<Edge> getEdges() {
			return edges;
		}

	}

	private class Edge {
		private Node from;
		private Node to;
		private int weight;

		public Edge(Node from, Node to, int weight) {
			super();
			this.from = from;
			this.to = to;
			this.weight = weight;
		}

		@Override
		public String toString() {
			return from + " -> " + to;
		}

	}

	private Map<String, Node> nodes = new HashMap<String, Node>();

	public void addNode(String label) {
		nodes.putIfAbsent(label, new Node(label));

	}

	public void addEdge(String from, String to, int weight) {
		Node fromNode = nodes.get(from);
		if (fromNode == null)
			throw new IllegalArgumentException();
		Node toNode = nodes.get(to);
		if (toNode == null)
			throw new IllegalArgumentException();

		fromNode.addEdge(toNode, weight);
		toNode.addEdge(fromNode, weight);

	}

	public void print() {
		for (var node : nodes.values()) {
			var edge = node.getEdges();
			if (!edge.isEmpty())
				System.out.println(node + " is connected to " + edge);
		}
	}

	public static void main(String[] args) {
		var graph = new WeightedGraph();
		graph.addNode("A");
		graph.addNode("B");
		graph.addNode("C");

		graph.addEdge("A", "B", 4);
		graph.addEdge("A", "C", 3);
		graph.print();
	}
}
