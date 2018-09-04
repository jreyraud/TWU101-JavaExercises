package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;
//change import to list...
public class Node {
    private String name;
    private Node left;
    private Node right;

    public Node(String name) {
        this.name = name;
    }

    public void add(String nameOfNewNode) {
        //this = addRecursive(this, nameOfNewNode);

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

    /*private Node addRecursive(Node node, String nameOfNewNode){
        if (node == null){
            node = new Node(nameOfNewNode);
        }
        else if (isBefore(nameOfNewNode, name)){
            node.left = addRecursive(node.left, nameOfNewNode);
        }
        else{
            node.right = addRecursive(node.right, nameOfNewNode);
        }
        return node;
    }*/

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
