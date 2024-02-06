package graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Graph {

	private class Node {
		private String label;

		public Node(String label) {
			this.label = label;
		}

		@Override
		public String toString() {
			return label;
		}
	}

	private Map<String, Node> map = new HashMap<String, Graph.Node>();

	private Map<Node, List<Node>> adjacencyList = new HashMap<Graph.Node, List<Node>>();

	public void addNode(String label) {
		Node node = new Node(label);
		map.putIfAbsent(label, node);
		adjacencyList.putIfAbsent(node, new ArrayList<>());
	}

	public void removeNode(String label) {
		var node = map.get(label);
		if (node == null)
			return;

		for (var n : adjacencyList.keySet()) {
			adjacencyList.get(n).remove(node);
		}

		map.remove(node);
	}

	private void addEdge(String from, String to) {
		var fromNode = map.get(from);
		if (fromNode == null)
			throw new IllegalArgumentException();
		var toNode = map.get(to);
		if (toNode == null)
			throw new IllegalArgumentException();
		adjacencyList.get(fromNode).add(toNode);
	}

	private void removeEdge(String from, String to) {
		var fromNode = map.get(from);
		if (fromNode == null)
			throw new IllegalArgumentException();
		var toNode = map.get(to);
		if (toNode == null)
			throw new IllegalArgumentException();
		adjacencyList.get(fromNode).remove(toNode);
	}

	public void print() {
		for (var source : adjacencyList.keySet()) {
			var target = adjacencyList.get(source);
			if (!target.isEmpty())
				System.out.println(source + " is connected to " + target);
		}
	}

	public void traverseDepthFirst(String label) {
		var node = map.get(label);
		if (node == null)
			return;
		traverseDFS(node, new HashSet<>());
	}

	private void traverseDFS(Node node, Set<Node> visited) {
		System.out.println(node);
		visited.add(node);

		for (var n : adjacencyList.get(node))
			if (!visited.contains(n))
				traverseDFS(n, visited);

	}

	public void traverseIterative(String label) {
		var node = map.get(label);
		if (node == null)
			return;
		Set<Node> visited = new HashSet<Graph.Node>();
		Stack<Node> st = new Stack<Graph.Node>();
		st.push(node);

		while (!st.isEmpty()) {
			Node curNode = st.pop();
			if (!visited.contains(curNode)) {
				System.out.println(curNode);
				visited.add(curNode);
				for (var n : adjacencyList.get(curNode)) {
					st.push(n);
				}
			}
		}
	}

	public void traversebfs(String label) {
		var node = map.get(label);
		if (node == null)
			return;
		Set<Node> visited = new HashSet<Graph.Node>();
		Queue<Node> queue = new ArrayDeque<Graph.Node>();
		queue.offer(node);

		while (!queue.isEmpty()) {
			Node curNode = queue.poll();
			if (!visited.contains(curNode)) {
				System.out.println(curNode);
				visited.add(curNode);
				for (var n : adjacencyList.get(curNode)) {
					queue.offer(n);
				}
			}
		}
	}

	public List<String> topologicalSort() {
		Set<Node> vistited = new HashSet<Graph.Node>();
		Stack<Node> st = new Stack<Graph.Node>();

		for (var node : map.values())
			ts(node, vistited, st);

		List<String> list = new ArrayList<>();
		while (!st.isEmpty())
			list.add(st.pop().label);

		return list;

	}

// Here we are using dfs for topical sort 
	private void ts(Node node, Set<Node> vistited, Stack<Node> st) {

		if (vistited.contains(node))
			return;

		vistited.add(node);

		for (var n : adjacencyList.get(node))
			ts(n, vistited, st);

		st.push(node);
	}

	public boolean hasCycle() {
		Set<Node> all = new HashSet<Graph.Node>(map.values());
		Set<Node> visiting = new HashSet<Graph.Node>();
		Set<Node> visited = new HashSet<Graph.Node>();

		while (!all.isEmpty()) {
			var currNode = all.iterator().next();
			if (hasCycle(currNode, all, visiting, visited))
				return true;
		}

		return false;
	}

	private boolean hasCycle(Node currNode, Set<Node> all, Set<Node> visiting, Set<Node> visited) {
		visiting.add(currNode);
		all.remove(currNode);

		for (var neighbour : adjacencyList.get(currNode)) {
			if (visited.contains(neighbour))
				continue;
			if (visiting.contains(neighbour))
				return true;
			if (hasCycle(neighbour, all, visiting, visited))
				return true;
		}
		visiting.remove(currNode);
		visited.add(currNode);

		return false;
	}

	public static void main(String[] args) {
		Graph gp = new Graph();
		/*
		 * gp.addNode("A"); gp.addNode("B"); gp.addNode("C"); gp.addEdge("A", "B");
		 * gp.addEdge("A", "C"); gp.addEdge("B", "C");
		 */
		// gp.print();
		// gp.traverseDepthFirst("A");
		// gp.traverseIterative("A");
		// System.out.println();
		// gp.traversebfs("A");
		/*
		 * gp.removeEdge("B", "C"); gp.print(); gp.removeNode("C"); gp.print();
		 */
		gp.addNode("X");
		gp.addNode("A");
		gp.addNode("B");
		gp.addNode("P");
		gp.addEdge("X", "A");
		gp.addEdge("X", "B");
		gp.addEdge("A", "P");
		gp.addEdge("B", "P");
		gp.print();
		System.out.println(gp.topologicalSort());
		System.out.println(gp.hasCycle());

	}
}
