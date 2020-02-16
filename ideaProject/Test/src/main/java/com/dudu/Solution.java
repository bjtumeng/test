//package com.dudu;
//
//import com.sun.corba.se.spi.ior.IdentifiableFactory;
//
//import java.util.Stack;
//
///**
// * @author zhaomeng
// * @Description:
// * @date 2019/1/13 10:39
// */
//class Node{
//    int val;
//    Node left=null;
//    Node right=null;
//    Node(int val){
//      this.val=val;
//    }
//}
//public class Solution {
//
//    public static void preOrderRecur(Node node){
//        Stack  stack=new Stack();
//        if (node==null){
//            return ;
//        }
//        stack.push(node);
//        while(node!=null){
//            stack.pop();
//            System.out.print(node.val+" ");
//            if (node.right!=null){
//                stack.push(node.right);
//            }
//            if (node.left==null){
//                if (stack.size()==0){
//                    return;
//                }
//                node=(Node)stack.peek();
//               continue;
//            }
//            if (node.left!=null) {
//                node = node.left;
//                stack.push(node);
//            }
//
//        }
//
//    }
//    public static void preOrderUnRecur(Node node){
//        if (node!=null) {
//            Stack<Node> stack = new Stack<>();
//            stack.push(node);
//            while (!stack.empty()) {
//                node =stack.pop();
//                System.out.print(node.val+" ");
//                if (node.right!=null){
//                    stack.push(node.right);
//                }
//                if (node.left!=null){
//                    stack.push(node.left);
//                }
//            }
//        }
//    }
//    public static int UnpreOrderRecur(Node node) {
//        if (node==null){
//            System.out.println(-1);
//            return -1;
//        }
//        System.out.print(node.val+" ");
//        UnpreOrderRecur(node.left);
//        UnpreOrderRecur(node.right);
//        return 0;
//    }
//
//    public static void main(String[] args) {
//        Node head=new Node(1);
//        head.left=new Node(2);
//        head.right=new Node(3);
//        head.left.right=new Node(5);
//        head.left.left=new Node(4);
//        head.left.right.left=new Node(6);
//        head.left.right.right=new Node(7);
////        preOrderUnRecur(head);
//        UnpreOrderRecur(head);
//    }
//}
