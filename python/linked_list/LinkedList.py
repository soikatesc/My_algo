from linked_list.node import *

class LinkedList(object):

	def __init__(self):
		self.head = None

	def insertStart(self, data):
		newNode = Node(data)

		if not self.head:
			self.head = newNode;
		else:
			newNode.next = self.head
			self.head = newNode 
