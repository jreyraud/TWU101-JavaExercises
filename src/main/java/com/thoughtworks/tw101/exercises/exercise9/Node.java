package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private Node left;
    private Node right;

    public Node(String name) {
        this.name = name;
    }

    public void add(String nameOfNewNode) {

        if (name == null){
            name = nameOfNewNode;
        }
        else if (isBefore(nameOfNewNode, name)){
            if (left == null) left = new Node(null);
            left.add(nameOfNewNode);
        }
        else {
            if (right == null) right = new Node (null);
            right.add(nameOfNewNode);
        }
    }



    private boolean isBefore(String newData, String oldData){
        if (newData.compareTo(oldData) == 0) return true;
        else if (newData.compareTo(oldData) < 0) return true;
        else return false;

    }

    public List<String> names() {
        ArrayList<String> names = new ArrayList<>();
        namesRecursive(this, names);
        return names;
    }

    private void namesRecursive(Node node, ArrayList<String> names){
        if (node == null) return;

        namesRecursive(node.left, names);
        names.add(node.name);
        namesRecursive(node.right, names);

    }
}
