package org.eclipse.ecl.ast;

import org.eclipse.ecl.core.Exec;
import org.eclipse.ecl.core.Parallel;
import org.eclipse.ecl.core.Parameter;
import org.eclipse.ecl.core.Pipeline;
import org.eclipse.ecl.core.Sequence;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;

public class AstVisitor {

	public boolean enterSequence(int start, int end, Sequence sequence) {
		return true;
	}

	public void exitSequence(int start, int end, Sequence sequence) {
	}

	public boolean enterParallel(int start, int end, Parallel parallel) {
		return true;
	}

	public void exitParallel(int start, int end, Parallel parallel) {
	}

	public boolean enterPipeline(int start, int end, Pipeline pipeline) {
		return true;
	}

	public void exitPipeline(int start, int end, Pipeline pipeline) {
	}

	public boolean enterCommand(int start, int end, Exec exec, EClass scriptlet) {
		return true;
	}

	public void exitCommand(int start, int end, Exec exec, EClass scriptlet) {
	}

	public void commandNamespace(int start, int end, String ns, Exec owner) {
	}

	public void commandName(int start, int end, String name, Exec owner) {
	}

	public boolean enterParameter(int start, int end, Parameter owner) {
		return true;
	}

	public void exitParameter(int start, int end, Parameter owner) {
	}

	public void parameterName(int start, int end, String name, Parameter owner) {
	}

	public void parameterValue(int start, int end, Object value, Parameter owner) {
	}

	public void literal(int start, int end, String value, EDataType type,
			Parameter owner) {
	}

	public void number(int start, int end, int value, EDataType type,
			Parameter owner) {
	}

	public void string(int start, int end, String value, EDataType type,
			Parameter owner) {
	}

	public void enterCurly(int start, int end, Parameter owner) {
	}

	public void exitCurly(int start, int end, Parameter owner) {
	}

	public void enterParen(int start, int end, Parameter owner) {
	}

	public void exitParen(int start, int end, Parameter owner) {
	}

	public void enterSubstitution(int start, int end, Parameter owner) {
	}

	public void exitSubstitution(int start, int end, Parameter owner) {
	}

	public void colon(int start) {
	}

	public void and(int start) {
	}

	public void or(int start) {
	}

	public void lparen(int start) {
	}

	public void rparen(int start) {
	}

	public void lcurly(int start) {
	}

	public void rcurly(int start) {
	}

	public void lbrack(int start) {
	}

	public void rbrack(int start) {
	}

	public void ws(int start, int end) {
	}

	public void nl(int start, int end) {
	}

	public void noParse(int start, int end) {
	}
}
