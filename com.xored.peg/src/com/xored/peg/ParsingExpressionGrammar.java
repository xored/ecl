/*
 * ParsingExpressionGrammar.java
 *
 * Created on September 3, 2006, 5:51 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.xored.peg;

/**
 * <p>
 * This class is the hand-parsed tree of the Parsing Expression Grammar
 * specification (PEG.txt) found in the examples directory of this distribution.
 * </p>
 * <p>
 * When used as the grammar for a PackratParser, this class allows for
 * specification of arbitrary grammars (with the PEG format). Most context-free
 * grammars (CFG) can be specified by PEGs, even though not all of them. Any
 * regular language can be trivially specified by a PEG also.
 * </p>
 * <p>
 * Possibly the best way to describe PGs is through some examples. A basic
 * arithmetic calculator PEG can be specified as follows:
 * 
 * <pre>
 *    Calculation    <- Addition EndOfFile
 *    Addition       <- Multiplication ( PLUS Multiplication )*
 *    Multiplication <- Operand ( MULT Operand )*
 *    Operand        <- Number / OPEN Addition CLOSE
 *    Number         <- '0' / '[1-9][0-9]*'
 *    OPEN           <- '\('
 *    CLOSE          <- '\)'
 *    PLUS           <- '\+'
 *    MULT           <- '\*'
 *    EndOfFile      <- !.
 * </pre>
 * 
 * Note that this specification does not allow for blanks between tokens for
 * simplicity. In order to recognize white spaces, we would need to define them
 * and use them in the places where we want to introduce them (typically at the
 * end of each definition and at the beginning of the first one).
 * </p>
 * <p>
 * Also note that the lexical tokens +, * ( and ) are escaped. This is because
 * everything that is between quotation marks is defined as a regular expression
 * Pattern, and these characters have special meanings in the regexp
 * specification, thus, the need for a backslash.
 * </p>
 * <p>
 * Furthermore, the tokens are defined with all capitals. This is a convention
 * only and is not required. It is also not required to define these tokens at
 * all, and so, for instance, the definition of a Multiplication could have been
 * changed to
 * 
 * <pre>
 *     Multiplication <- Calculation ( '\*' Calculation )*
 * </pre>
 * 
 * without influencing the outcome of the parsing.
 * </p>
 * <p>
 * While this practice is allowed, it is discuraged in general since in this
 * last example, the operator "*" would be parsed as an anonymous token of
 * meta-type LITERAL, while in the first example, it would have its own type (8,
 * for being the 9-th definition).
 * </p>
 * <p>
 * Typically parsers will attempt to parse a String into the first definition
 * (in this case a Calculation). Normally, the first definition will also
 * include an end-of-file token to assure there is no 'garbage' at the end of
 * the parsed String.
 * </p>
 * <p>
 * An extra advantage to this is that every parsed Calculation will ONLY have
 * exactly one Block of type zero (the root). And the parsed String represents
 * it.
 * </p>
 * <p>
 * For example, the String "13+4*3+(5+3*2)" would parse into the following tree
 * (with optimization):
 * 
 * <pre>
 * Block (13+4*3+(5+3*2)), type [0]
 *   Block (13+4*3+(5+3*2)), type [1]
 *     Block (13), type [4]
 *     Block (+4*3+(5+3*2)), type [-5]
 *       Block (+4*3), type [-3]
 *         Block (+), type [7]
 *         Block (4*3), type [2]
 *           Block (4), type [4]
 *           Block (*3), type [-3]
 *             Block (*), type [8]
 *             Block (3), type [4]
 *       Block (+(5+3*2)), type [-3]
 *         Block (+), type [7]
 *         Block ((5+3*2)), type [3]
 *           Block ((), type [5]
 *           Block (5+3*2), type [1]
 *             Block (5), type [4]
 *             Block (+3*2), type [-3]
 *               Block (+), type [7]
 *               Block (3*2), type [2]
 *                 Block (3), type [4]
 *                 Block (*2), type [-3]
 *                   Block (*), type [8]
 *                   Block (2), type [4]
 *           Block ()), type [6]
 * </pre>
 * 
 * Here, the hierarchy is reperesented by indentation.
 * </p>
 * <p>
 * Many things can be seen from this example. First, notice that by using the
 * information whthin parenthesis (the text parsed for that Block), and the
 * numerical type of the Blocks, we can reconstruct the operations that need to
 * be performed in order to evaluate this String to a numerical value.
 * </p>
 * <p>
 * Also, the usage of meta-types can be observed by Blocks with negative types.
 * These are typically place-holder Blocks for parenthesized descriptions in the
 * grammar, or prefix and suffix expressions and finally literals and
 * identifiers.
 * </p>
 * 
 * @author Edgar A. Duenez-Guzman
 */
public final class ParsingExpressionGrammar extends ParsingGrammar {
	/*
	 * # Type 0 # Type 1
	 * 
	 * # Type 2 # Type 3 # Type 4 # Type 5
	 * 
	 * 
	 * # Lexical syntax # Type 7
	 * 
	 * 
	 * 
	 * # Type 10 # Type 11 # Type 12 # Type 13 # Type 14 # Type 15 # Type 16 #
	 * Type 17 # Type 18 # Type 19
	 * 
	 * # Type 20 # Type 21 # Type 22 # Type 23 # Type 24
	 */

	/**
	 * Type for a grammar, the meta-definition is as follows:
	 * 
	 * <pre>
	 *    Grammar    <- Spacing Definition+ EndOfFile
	 * </pre>
	 */
	public static final int GRAMMAR = 0;
	/**
	 * Type for a definition, the meta-definition is as follows:
	 * 
	 * <pre>
	 *    Definition <- Identifier LEFTARROW Expression
	 * </pre>
	 */
	public static final int DEFINITION = 1;

	/**
	 * Type for an expression, the meta-definition is as follows:
	 * 
	 * <pre>
	 *    Expression <- Sequence (SLASH Sequence)*
	 * </pre>
	 */
	public static final int EXPRESSION = 2;
	/**
	 * Type for a sequence, the meta-definition is as follows:
	 * 
	 * <pre>
	 *    Sequence   <- Prefix*
	 * </pre>
	 */
	public static final int SEQUENCE = 3;
	/**
	 * Type for a prefix, the meta-definition is as follows:
	 * 
	 * <pre>
	 *    Prefix     <- (AND / NOT)? Suffix
	 * </pre>
	 */
	public static final int PREFIX = 4;
	/**
	 * Type for a suffix, the meta-definition is as follows:
	 * 
	 * <pre>
	 *    Suffix     <- Primary (QUESTION / STAR / PLUS)?
	 * </pre>
	 */
	public static final int SUFFIX = 5;
	/**
	 * Type for a primary, the meta-definition is as follows:
	 * 
	 * <pre>
	 *    Primary    <- Identifier !LEFTARROW / OPEN Expression CLOSE / Literal / DOT
	 * </pre>
	 */
	public static final int PRIMARY = 6;

	/**
	 * Type for an identifier, the meta-definition is as follows:
	 * 
	 * <pre>
	 *    Identifier <- '[a-zA-Z_][a-zA-Z_0-9]*' Spacing
	 * </pre>
	 */
	public static final int IDENTIFIER = 7;
	/**
	 * Type for a literal, the meta-definition is as follows:
	 * 
	 * <pre>
	 *    Literal    <- "'" (!"'" Char)* "'" Spacing / '"' (!'"' Char)* '"' Spacing
	 * </pre>
	 */
	public static final int LITERAL = 8;
	/**
	 * Type for a character, the meta-definition is as follows:
	 * 
	 * <pre>
	 *    Char       <- '\\[nrt\'"\+\-\*\.\?\^\$\{\}\(\)\[\]\\]' / '\\[0-2][0-7][0-7]' / '\\[0-7][0-7]?' / !'\\' .
	 * </pre>
	 */
	public static final int CHAR = 9;
	/**
	 * Type for a left arrow, the meta-definition is as follows:
	 * 
	 * <pre>
	 *    LEFTARROW  <- '<-' Spacing
	 * </pre>
	 */
	public static final int LEFTARROW = 10;
	/**
	 * Type for a slash, the meta-definition is as follows:
	 * 
	 * <pre>
	 *    SLASH      <- '/' Spacing
	 * </pre>
	 */
	public static final int SLASH = 11;
	/**
	 * Type for an ampersand, the meta-definition is as follows:
	 * 
	 * <pre>
	 *    AND        <- '&' Spacing
	 * </pre>
	 */
	public static final int AND = 12;
	/**
	 * Type for a not mark, the meta-definition is as follows:
	 * 
	 * <pre>
	 *    NOT        <- '!' Spacing
	 * </pre>
	 */
	public static final int NOT = 13;
	/**
	 * Type for a question mark, the meta-definition is as follows:
	 * 
	 * <pre>
	 *    QUESTION   <- '\\?' Spacing
	 * </pre>
	 */
	public static final int QUESTION = 14;
	/**
	 * Type for a star sign, the meta-definition is as follows:
	 * 
	 * <pre>
	 *    STAR       <- '\\*' Spacing
	 * </pre>
	 */
	public static final int STAR = 15;
	/**
	 * Type for a plus sign, the meta-definition is as follows:
	 * 
	 * <pre>
	 *    PLUS       <- '\\+' Spacing
	 * </pre>
	 */
	public static final int PLUS = 16;
	/**
	 * Type for a opening parenthesis, the meta-definition is as follows:
	 * 
	 * <pre>
	 *    OPEN       <- '\\(' Spacing
	 * </pre>
	 */
	public static final int OPEN = 17;
	/**
	 * Type for a closing parenthesis, the meta-definition is as follows:
	 * 
	 * <pre>
	 *    CLOSE      <- '\\)' Spacing
	 * </pre>
	 */
	public static final int CLOSE = 18;
	/**
	 * Type for a dot, the meta-definition is as follows:
	 * 
	 * <pre>
	 *    DOT        <- '\\.' Spacing
	 * </pre>
	 */
	public static final int DOT = 19;

	/**
	 * Type for a spacing, the meta-definition is as follows:
	 * 
	 * <pre>
	 *    Spacing    <- (Space / Comment)*
	 * </pre>
	 */
	public static final int SPACING = 20;
	/**
	 * Type for a comment, the meta-definition is as follows:
	 * 
	 * <pre>
	 *    Comment    <- '#' (!EndOfLine .)* EndOfLine
	 * </pre>
	 */
	public static final int COMMENT = 21;
	/**
	 * Type for a space, the meta-definition is as follows:
	 * 
	 * <pre>
	 * Space &lt; -' ' / '\t' / EndOfLine
	 * </pre>
	 */
	public static final int SPACE = 22;
	/**
	 * Type for an end of line, the meta-definition is as follows:
	 * 
	 * <pre>
	 *    EndOfLine  <- '\r\n' / '\n' / '\r'
	 * </pre>
	 */
	public static final int EOL = 23;
	/**
	 * Type for an end of file, the meta-definition is as follows:
	 * 
	 * <pre>
	 *    EndOfFile  <- !.
	 * </pre>
	 */
	public static final int EOF = 24;

	/**
	 * The names of the definitions, indexed by their numeric type.
	 */
	public static final String Definitions[] = { "Grammar", "Definition",
			"Expression", "Sequence", "Prefix", "Suffix", "Primary",
			"Identifier", "Literal", "Char", "LEFTARROW", "SLASH", "AND",
			"NOT", "QUESTION", "STAR", "PLUS", "OPEN", "CLOSE", "DOT",
			"Spacing", "Comment", "Space", "EndOfLine", "EndOfFile" };
	/**
	 * The grammar tree, typically used to initialize a ParsingGrammar.
	 */
	public static final Block grammar = new Block("", 0, 0, SUFFIX, null);

	/**
     * The array of definitions (left-hand side of the identifier), indexed by
     * numeric type. Thus, subBlocks[i] has the Block tree that corresponds to
     * the expression that defines that type. This array is for initialization
     * purposes only, and should not be accessed directly.
     */
    protected static final Block subBlocks[] = {
        //The grammar block (G)
        new Block( "", 0, 0, SEQUENCE, 
            new Block[] {
                new Block( "Spacing", 0, 7, IDENTIFIER, null ),
                new Block( "", 0, 0, SUFFIX, 
                        new Block[] {
                            new Block( "Definition", 0, 10, IDENTIFIER, null ),
                            new Block( "+", 0, 1, PLUS, null ),
                        }
                ),
                new Block( "EndOfFile", 0, 9, IDENTIFIER, null )
            }
        ),
        //The definition block (D)
        new Block( "", 0, 0, SEQUENCE, 
            new Block[] {
                new Block( "Identifier", 0, 10, IDENTIFIER, null ),
                new Block( "LEFTARROW", 0, 9, IDENTIFIER, null ),
                new Block( "Expression", 0, 10, IDENTIFIER, null )
            }
        ),

        //The expression block (E)
        new Block( "", 0, 0, SEQUENCE, 
            new Block[] {
                new Block( "Sequence", 0, 8, IDENTIFIER, null ),
                new Block( "", 0, 0, SUFFIX, 
                        new Block[] {
                            new Block( "", 0, 0, SEQUENCE, 
                                    new Block[] {
                                        new Block( "(", 0, 1, OPEN, null ),
                                        new Block( "", 0, 0, SEQUENCE, 
                                                new Block[] {
                                                    new Block( "SLASH", 0, 5, IDENTIFIER, null ),
                                                    new Block( "Sequence", 0, 8, IDENTIFIER, null )
                                                }
                                        ),
                                        new Block( ")", 0, 1, CLOSE, null )
                                    }
                            ),
                            new Block( "*", 0, 1, STAR, null )
                        }
                )
            }
        ),
        //The sequence block (S)
        new Block( "", 0, 0, SUFFIX,
                new Block[] {
                    new Block( "Prefix", 0, 6, IDENTIFIER, null ),
                    new Block( "*", 0, 1, STAR, null )
                }
        ),
        //The prefix block (Pre)
        new Block( "", 0, 0, SEQUENCE,
            new Block[] {
                new Block( "", 0, 0, SUFFIX, 
                        new Block[] {
                            new Block( "", 0, 0, SEQUENCE,
                                    new Block[] {
                                        new Block( "(", 0, 1, OPEN, null ),
                                        new Block( "", 0, 0, EXPRESSION,
                                                new Block[] {
                                                    new Block( "AND", 0, 3, IDENTIFIER, null ),
                                                    new Block( "", 0, 0, SEQUENCE,
                                                            new Block[] {
                                                                new Block( "/", 0, 1, SLASH, null ),
                                                                new Block( "NOT", 0, 3, IDENTIFIER, null )
                                                            }
                                                    )
                                                }
                                        ),
                                        new Block( ")", 0, 1, CLOSE, null )
                                    }
                            ),
                            new Block( "?", 0, 1, QUESTION, null )
                        }
                ),
                new Block( "Suffix", 0, 6, IDENTIFIER, null )
            }
        ),
        //The suffix block (Su)
        new Block( "", 0, 0, SEQUENCE,
            new Block[] {
                new Block( "Primary", 0, 7, IDENTIFIER, null ),
                new Block( "", 0, 0, SUFFIX, 
                        new Block[] {
                            new Block( "", 0, 0, SEQUENCE,
                                    new Block[] {
                                        new Block( "(", 0, 1, OPEN, null ),
                                        new Block( "", 0, 0, EXPRESSION,
                                                new Block[] {
                                                    new Block( "QUESTION", 0, 8, IDENTIFIER, null ),
                                                    new Block( "", 0, 0, SUFFIX,
                                                            new Block[] {
                                                                new Block( "", 0, 0, SEQUENCE, 
                                                                        new Block[] {
                                                                            new Block( "/", 0, 1, SLASH, null ),
                                                                            new Block( "STAR", 0, 4, IDENTIFIER, null ),
                                                                        }
                                                                ),
                                                                new Block( "", 0, 0, SEQUENCE, 
                                                                        new Block[] {
                                                                            new Block( "/", 0, 1, SLASH, null ),
                                                                            new Block( "PLUS", 0, 4, IDENTIFIER, null )
                                                                        }
                                                                )
                                                            }
                                                    )
                                                }
                                        ),
                                        new Block( ")", 0, 1, CLOSE, null )
                                    }
                            ),
                            new Block( "?", 0, 1, QUESTION, null )
                        }
                )
            }
        ),
        //The primary block (P)
        new Block( "", 0, 0, EXPRESSION,
            new Block[] {
                new Block( "", 0, 0, SEQUENCE, 
                        new Block[] {
                            new Block( "Identifier", 0, 10, IDENTIFIER, null ),
                            new Block( "", 0, 0, PREFIX, 
                                    new Block[] {
                                        new Block( "!", 0, 1, NOT, null ),
                                        new Block( "LEFTARROW", 0, 9, IDENTIFIER, null )
                                    }
                            ),
                        }
                ),
                new Block( "", 0, 0, SUFFIX,
                        new Block[] {
                            new Block( "", 0, 0, SEQUENCE,
                                    new Block[] {
                                        new Block( "/", 0, 1, SLASH, null ),
                                        new Block( "", 0, 0, SEQUENCE, 
                                                new Block[] {
                                                    new Block( "OPEN", 0, 4, IDENTIFIER, null ),
                                                    new Block( "Expression", 0, 10, IDENTIFIER, null ),
                                                    new Block( "CLOSE", 0, 5, IDENTIFIER, null )
                                                }
                                        )
                                    }
                            ),
                            new Block( "", 0, 0, SEQUENCE,
                                    new Block[] {
                                        new Block( "/", 0, 1, SLASH, null ),
                                        new Block( "Literal", 0, 7, IDENTIFIER, null )
                                    }
                            ),
                            new Block( "", 0, 0, SEQUENCE,
                                    new Block[] {
                                        new Block( "/", 0, 1, SLASH, null ),
                                        new Block( "DOT", 0, 3, IDENTIFIER, null )
                                    }
                            )
                        }
                )
            }
        ),

        //The indentifier block (I)
        new Block( "" , 0, 0, SEQUENCE,
            new Block[] {
                new Block( "'[a-zA-Z_][a-zA-Z_0-9]*'", 0, 24, LITERAL, null ),
                new Block( "Spacing", 0, 7, IDENTIFIER, null )
            }
        ),
        //The literal block (L)
        new Block( "" , 0, 0, EXPRESSION,
            new Block[] {
                new Block( "", 0, 0, SEQUENCE, 
                        new Block[] {
                            new Block( "\"'\"", 0, 3, LITERAL, null ),
                            new Block( "", 0, 0, SUFFIX, 
                                    new Block[] {
                                        new Block( "", 0, 0, SEQUENCE,
                                                new Block[] {
                                                    new Block( "(", 0, 1, OPEN, null ),
                                                    new Block( "", 0, 0, SEQUENCE, 
                                                            new Block[] {
                                                                new Block( "", 0, 0, PREFIX, 
                                                                        new Block[] {
                                                                            new Block( "!", 0, 1, NOT, null ),
                                                                            new Block( "\"'\"", 0, 3, LITERAL, null ),
                                                                        }
                                                                ),
                                                                new Block( "Char", 0, 4, IDENTIFIER, null )
                                                            }
                                                    ),
                                                    new Block( ")", 0, 1, CLOSE, null ),
                                                }
                                        ),
                                        new Block( "*", 0, 1, STAR, null )
                                    }
                            ),
                            new Block( "\"'\"", 0, 3, LITERAL, null ),
                            new Block( "Spacing", 0, 7, IDENTIFIER, null )
                        }
                ),
                new Block( "", 0, 0, SEQUENCE,
                        new Block[] {
                            new Block( "/", 0, 1, SLASH, null ),
                            new Block( "", 0, 0, SEQUENCE, 
                                    new Block[] {
                                        new Block( "'\"'", 0, 3, LITERAL, null ),
                                        new Block( "", 0, 0, SUFFIX, 
                                                new Block[] {
                                                    new Block( "", 0, 0, SEQUENCE,
                                                            new Block[] {
                                                                new Block( "(", 0, 1, OPEN, null ),
                                                                new Block( "", 0, 0, SEQUENCE, 
                                                                    new Block[] {
                                                                            new Block( "", 0, 0, PREFIX, 
                                                                                    new Block[] {
                                                                                        new Block( "!", 0, 1, NOT, null ),
                                                                                        new Block( "'\"'", 0, 3, LITERAL, null ),
                                                                                    }
                                                                            ),
                                                                            new Block( "Char", 0, 4, IDENTIFIER, null )
                                                                        }
                                                                ),
                                                                new Block( ")", 0, 1, CLOSE, null ),
                                                            }
                                                    ),
                                                    new Block( "*", 0, 1, STAR, null )
                                                }
                                        ),
                                        new Block( "'\"'", 0, 3, LITERAL, null ),
                                        new Block( "Spacing", 0, 7, IDENTIFIER, null )
                                    }
                            )
                        }
                )
            }
        ),
        //The char block (Ch)
        new Block( "" , 0, 0, EXPRESSION,
            new Block[] {
            //TODO: This seems to be a deficient reg-exp
                new Block( "'\\\\[nrt\\'\"\\+\\-\\*\\.\\?\\^\\$\\{\\}\\(\\)\\[\\]\\\\\\|]'", 0, 42, LITERAL, null ),
                new Block( "", 0, 0, SUFFIX, 
                        new Block[] {
                            new Block( "", 0, 0, SEQUENCE, 
                                    new Block[] {
                                        new Block( "/", 0, 1, SLASH, null ),
                                        new Block( "'\\\\[0-2][0-7][0-7]'", 0, 19, LITERAL, null )
                                    }
                            ),
                            new Block( "", 0, 0, SEQUENCE, 
                                    new Block[] {
                                        new Block( "/", 0, 1, SLASH, null ),
                                        new Block( "'\\\\[0-7][0-7]?'", 0, 15, LITERAL, null ),
                                    }
                            ),
                            new Block( "", 0, 0, SEQUENCE, 
                                    new Block[] {
                                        new Block( "/", 0, 1, SLASH, null ),
                                        new Block( "'\\.'", 0, 4, LITERAL, null ),
                                    }
                            ),
                            new Block( "", 0, 0, SEQUENCE, 
                                    new Block[] {
                                        new Block( "/", 0, 1, SLASH, null ),
                                        new Block( "", 0, 0, SEQUENCE, 
                                                new Block[] {
                                                    new Block( "", 0, 0, PREFIX, 
                                                            new Block[] {
                                                                new Block( "!", 0, 1, NOT, null ),
                                                                new Block( "'\\\\'", 0, 4, LITERAL, null ),
                                                            }
                                                    ),
                                                    new Block( ".", 0, 1, DOT, null )
                                                }
                                        ),
                                    }
                            )
                        }
                 )
            }
        ),

        //The left arrow block (<-)
        new Block( "" , 0, 0, SEQUENCE,
            new Block[] {
                new Block( "'<-'", 0, 4, LITERAL, null ),
                new Block( "Spacing", 0, 7, IDENTIFIER, null )
            }
        ),
        //The slash block (/)
        new Block( "" , 0, 0, SEQUENCE,
            new Block[] {
                new Block( "'\\|'", 0, 4, LITERAL, null ),
                new Block( "Spacing", 0, 7, IDENTIFIER, null )
            }
        ),
        //The and block (&)
        new Block( "" , 0, 0, SEQUENCE,
            new Block[] {
                new Block( "'&'", 0, 3, LITERAL, null ),
                new Block( "Spacing", 0, 7, IDENTIFIER, null )
            }
        ),
        //The not block (!)
        new Block( "" , 0, 0, SEQUENCE,
            new Block[] {
                new Block( "'!'", 0, 3, LITERAL, null ),
                new Block( "Spacing", 0, 7, IDENTIFIER, null )
            }
        ),
        //The question block (?)
        new Block( "" , 0, 0, SEQUENCE,
            new Block[] {
                new Block( "'\\?'", 0, 4, LITERAL, null ),
                new Block( "Spacing", 0, 7, IDENTIFIER, null )
            }
        ),
        //The star block (*)
        new Block( "" , 0, 0, SEQUENCE,
            new Block[] {
                new Block( "'\\*'", 0, 4, LITERAL, null ),
                new Block( "Spacing", 0, 7, IDENTIFIER, null )
            }
        ),
        //The plus block (+)
        new Block( "" , 0, 0, SEQUENCE,
            new Block[] {
                new Block( "'\\+'", 0, 4, LITERAL, null ),
                new Block( "Spacing", 0, 7, IDENTIFIER, null )
            }
        ),
        //The open block (()
        new Block( "" , 0, 0, SEQUENCE,
            new Block[] {
                new Block( "'\\('", 0, 4, LITERAL, null ),
                new Block( "Spacing", 0, 7, IDENTIFIER, null )
            }
        ),
        //The close block ())
        new Block( "" , 0, 0, SEQUENCE,
            new Block[] {
                new Block( "'\\)'", 0, 4, LITERAL, null ),
                new Block( "Spacing", 0, 7, IDENTIFIER, null )
            }
        ),
        //The dot block (.)
        new Block( "" , 0, 0, SEQUENCE,
            new Block[] {
                new Block( "'\\.'", 0, 4, LITERAL, null ),
                new Block( "Spacing", 0, 7, IDENTIFIER, null )
            }
        ),

        //The spacing block (Sp)
        new Block( "", 0, 0, SUFFIX,
            new Block[] {
                new Block( "", 0, 0, SEQUENCE, 
                        new Block[] {
                            new Block( "(", 0, 1, OPEN, null ),
                            new Block( "", 0, 0, EXPRESSION, 
                                    new Block[] {
                                        new Block( "Space", 0, 5, IDENTIFIER, null ),
                                        new Block( "", 0, 0, SEQUENCE, 
                                                new Block[] {
                                                    new Block( "/", 0, 1, SLASH, null ),
                                                    new Block( "Comment", 0, 7, IDENTIFIER, null )
                                                }
                                        )
                                    }
                            ),
                            new Block( ")", 0, 1, CLOSE, null )
                        }
                ),
                new Block( "*", 0, 1, STAR, null )
            }
        ),
        //The comment block (Com)
        new Block( "", 0, 0, SEQUENCE,
            new Block[] {
                new Block( "'#'", 0, 3, LITERAL, null ),
                new Block( "", 0, 0, SUFFIX, 
                        new Block[] {
                            new Block( "", 0, 0, SEQUENCE, 
                                    new Block[] {
                                        new Block( "(", 0, 1, OPEN, null ),
                                        new Block( "", 0, 0, SEQUENCE, 
                                                new Block[] {
                                                    new Block( "", 0, 0, PREFIX, 
                                                            new Block[] {
                                                                new Block( "!", 0, 1, NOT, null ),
                                                                new Block( "EndOfLine", 0, 9, IDENTIFIER, null )
                                                            }
                                                    ),
                                                    new Block( ".", 0, 1, DOT, null ),
                                                }
                                        ),
                                        new Block( ")", 0, 1, CLOSE, null )
                                    }
                            ),
                            new Block( "*", 0, 1, STAR, null )
                        }
                ),
                new Block( "EndOfLine", 0, 9, IDENTIFIER, null )
            }
        ),
        //The space block (Spc)
        new Block( "" , 0, 0, EXPRESSION,
            new Block[] {
                new Block( "' '", 0, 3, LITERAL, null ),
                new Block( "", 0, 0, SUFFIX, 
                        new Block[] {
                            new Block( "", 0, 0, SEQUENCE, 
                                    new Block[] {
                                        new Block( "/", 0, 1, SLASH, null ),
                                        new Block( "'\\t'", 0, 4, LITERAL, null )
                                    }
                            ),
                            new Block( "", 0, 0, SEQUENCE, 
                                    new Block[] {
                                        new Block( "/", 0, 1, SLASH, null ),
                                        new Block( "EndOfLine", 0, 9, IDENTIFIER, null )
                                    }
                            )
                        }
                )
            }
        ),
        //The EOL block (EOL)
        new Block( "" , 0, 0, EXPRESSION,
            new Block[] {
                new Block( "'\\r\\n'", 0, 6, LITERAL, null ),
                new Block( "", 0, 0, SUFFIX, 
                        new Block[] {
                            new Block( "", 0, 0, SEQUENCE, 
                                    new Block[] {
                                        new Block( "/", 0, 1, SLASH, null ),
                                        new Block( "'\\r'", 0, 4, LITERAL, null )
                                    }
                            ),
                            new Block( "", 0, 0, SEQUENCE, 
                                    new Block[] {
                                        new Block( "/", 0, 1, SLASH, null ),
                                        new Block( "'\\n'", 0, 4, LITERAL, null )
                                    }
                            )
                        }
                )
            }
        ),
        //The EOF block (EOF)
        new Block( "" , 0, 0, PREFIX,
            new Block[] {
                new Block( "!", 0, 1, NOT, null ),
                new Block( ".", 0, 1, DOT, null )
            }
        )
    };


	/**
	 * Creates the new instance of ParsingExpressionGrammar to be used in a
	 * PackratParser.
	 */
	static {
		// grammar.addChild( new Block( "", 0, 1, SUFFIX, new Block[0] ) );
		for (int i = 0; i < Definitions.length; i++) {
			// grammar.getChild(0).addChild( getBlockType(i) );
			grammar.addChild(getBlockType(i));
			// System.out.println( "Added grammar block " + Definitions[i] );
		}
		grammar.trimChildren();
	}

	/**
	 * Creates a new instance of ParsingExpressionGrammar.
	 */
	public ParsingExpressionGrammar() {
		super(grammar, false);
	}

	/**
	 * Gets the definition tree of the specified Block type.
	 */
	private static Block getBlockType(int type) {
		Block g = new Block("", 0, 0, DEFINITION, new Block[] {
				new Block(Definitions[type], 0, Definitions[type].length(),
						IDENTIFIER, null),
				new Block("<-", 0, 2, LEFTARROW, null), subBlocks[type] });
		return g;
	}
}
