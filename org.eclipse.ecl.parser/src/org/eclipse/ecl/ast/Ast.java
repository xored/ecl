package org.eclipse.ecl.ast;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.gen.ast.AstFactory;
import org.eclipse.ecl.gen.ast.AstPackage;
import org.eclipse.ecl.gen.ast.Node;
import org.eclipse.ecl.internal.parser.AstBuilder;
import org.eclipse.ecl.parser.EclParser;
import org.eclipse.ecl.parser.EclPartition;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;

import com.xored.peg.Block;

public class Ast {
	protected final Node root;
	protected final Command command;
	protected final String text;
	protected final Map<Node, Command> nodeToCommandMap = new HashMap<Node, Command>();
	protected final Map<Command, Node> commandToNodeMap = new HashMap<Command, Node>();
	protected final static EContentAdapter freezeAdapter = new EContentAdapter() {
		@Override
		public void notifyChanged(Notification notification) {
			super.notifyChanged(notification);
			throw new IllegalArgumentException(
					"It's not allowed to change an AST");
		}
	};

	public Ast(String text) throws CoreException {
		this.text = text;
		this.root = createNode(0, text.length(), EclPartition.unknown);
		Block block = new EclParser(text).parse();
		if (block == Block.NO_PARSE)
			throw new RuntimeException();
		command = new AstBuilder().build(block);
	}

	protected Node add(int start, int end, EclPartition partition, Node parent) {
		Node node = createNode(start, end, partition);
		parent.getChildren().add(node);
		return node;
	}

	private Node createNode(int start, int end, EclPartition partition) {
		Node node = AstFactory.eINSTANCE.createNode();
		node.eSet(AstPackage.eINSTANCE.getNode_Ast(), this);
		node.eSet(AstPackage.eINSTANCE.getNode_Start(), start);
		node.eSet(AstPackage.eINSTANCE.getNode_End(), end);
		node.eSet(AstPackage.eINSTANCE.getNode_Partition(), partition);
		return node;
	}

	public Node get(int pos) {
		throw new RuntimeException("Not implemented yet.");
	}

	public Command get(Node node) {
		throw new RuntimeException("Not implemented yet.");
		// return nodeToCommandMap.get(node);
	}

	public Node get(Command command) {
		throw new RuntimeException("Not implemented yet.");
		// return commandToNodeMap.get(command);
	}

	protected void connect(Node node, Command command) {
		throw new RuntimeException("Not implemented yet.");
		// commandToNodeMap.put(command, node);
		// nodeToCommandMap.put(node, command);
	}

	protected void freeze() {
		throw new RuntimeException("Not implemented yet.");
		// root.eAdapters().add(freezeAdapter);
	}

	public Command toCommand() {
		return command;
	}

	// public void accept(AstVisitor visitor) {
	// EClass eClass = ((EObject) ref).eClass();
	// switch (eClass.getClassifierID()) {
	// case CorePackage.SEQUENCE:
	// if (visitor.enterSequence(start, end, (Sequence) ref)) {
	// for (Node<?> child : children)
	// child.accept(visitor);
	// visitor.exitSequence(start, end, (Sequence) ref);
	// }
	// case CorePackage.PARALLEL:
	// if (visitor.enterParallel(start, end, (Parallel) ref)) {
	// for (Node<?> child : children)
	// child.accept(visitor);
	// visitor.exitParallel(start, end, (Parallel) ref);
	// }
	// case CorePackage.PIPELINE:
	// if (visitor.enterPipeline(start, end, (Pipeline) ref)) {
	// for (Node<?> child : children)
	// child.accept(visitor);
	// visitor.exitPipeline(start, end, (Pipeline) ref);
	// }
	// case CorePackage.EXEC:
	// Exec exec = (Exec) ref;
	// EClass command = null;
	// try {
	// command = CorePlugin.getScriptletManager()
	// .findCommand(
	// exec.getNamespace(),
	// EclCommandNameConvention.toScriptletName(exec
	// .getName()));
	// } catch (CoreException e) {
	// // Command wasn't found. Do nothing
	// }
	// if (visitor.enterCommand(start, end, exec, command)) {
	// Node<?> child = children.get(0);
	// if (child != null) {
	// visitor.visitCommandNamespace(child.start, child.end,
	// (String) child.ref, exec);
	// }
	// child = children.get(1);
	// visitor.visitCommandName(child.start, child.end,
	// (String) child.ref, exec);
	// for (int i = 2; i < children.size(); i++) {
	// children.get(i).accept(visitor);
	// }
	// visitor.exitCommand(start, end, exec, command);
	// }
	// case CorePackage.EXECUTABLE_PARAMETER:
	// case CorePackage.LITERAL_PARAMETER:
	// }
	// }
}
