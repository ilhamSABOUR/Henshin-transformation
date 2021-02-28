/**
 * generated by Xtext 2.24.0
 */
package org.xtext.example.userstory.userStory.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.xtext.example.userstory.userStory.Us;
import org.xtext.example.userstory.userStory.UserStoryFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Us</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UsTest extends TestCase {

	/**
	 * The fixture for this Us test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Us fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UsTest.class);
	}

	/**
	 * Constructs a new Us test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Us test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Us fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Us test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Us getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UserStoryFactory.eINSTANCE.createUs());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //UsTest
