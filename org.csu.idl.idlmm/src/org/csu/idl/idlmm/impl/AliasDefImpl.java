/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.csu.idl.idlmm.impl;

import org.csu.idl.idlmm.AliasDef;
import org.csu.idl.idlmm.Contained;
import org.csu.idl.idlmm.Container;
import org.csu.idl.idlmm.IDLType;
import org.csu.idl.idlmm.IdlmmPackage;
import org.csu.idl.idlmm.NamedElement;
import org.csu.idl.idlmm.TypedefDef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alias Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.idl.idlmm.impl.AliasDefImpl#getTypeCode <em>Type Code</em>}</li>
 *   <li>{@link org.csu.idl.idlmm.impl.AliasDefImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.csu.idl.idlmm.impl.AliasDefImpl#getRepositoryId <em>Repository Id</em>}</li>
 *   <li>{@link org.csu.idl.idlmm.impl.AliasDefImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.csu.idl.idlmm.impl.AliasDefImpl#getAbsoluteName <em>Absolute Name</em>}</li>
 *   <li>{@link org.csu.idl.idlmm.impl.AliasDefImpl#getDefinedIn <em>Defined In</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AliasDefImpl extends TypedImpl implements AliasDef {
	/**
	 * The default value of the '{@link #getTypeCode() <em>Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCode()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeCode() <em>Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCode()
	 * @generated
	 * @ordered
	 */
	protected String typeCode = TYPE_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepositoryId() <em>Repository Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositoryId()
	 * @generated
	 * @ordered
	 */
	protected static final String REPOSITORY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepositoryId() <em>Repository Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositoryId()
	 * @generated
	 * @ordered
	 */
	protected String repositoryId = REPOSITORY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbsoluteName() <em>Absolute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbsoluteName()
	 * @generated
	 * @ordered
	 */
	protected static final String ABSOLUTE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbsoluteName() <em>Absolute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbsoluteName()
	 * @generated
	 * @ordered
	 */
	protected String absoluteName = ABSOLUTE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AliasDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IdlmmPackage.Literals.ALIAS_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeCode() {
		return typeCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeCode(String newTypeCode) {
		String oldTypeCode = typeCode;
		typeCode = newTypeCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdlmmPackage.ALIAS_DEF__TYPE_CODE, oldTypeCode, typeCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdlmmPackage.ALIAS_DEF__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepositoryId() {
		return repositoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepositoryId(String newRepositoryId) {
		String oldRepositoryId = repositoryId;
		repositoryId = newRepositoryId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdlmmPackage.ALIAS_DEF__REPOSITORY_ID, oldRepositoryId, repositoryId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdlmmPackage.ALIAS_DEF__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAbsoluteName() {
		return absoluteName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbsoluteName(String newAbsoluteName) {
		String oldAbsoluteName = absoluteName;
		absoluteName = newAbsoluteName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdlmmPackage.ALIAS_DEF__ABSOLUTE_NAME, oldAbsoluteName, absoluteName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Container getDefinedIn() {
		if (eContainerFeatureID() != IdlmmPackage.ALIAS_DEF__DEFINED_IN) return null;
		return (Container)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinedIn(Container newDefinedIn, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDefinedIn, IdlmmPackage.ALIAS_DEF__DEFINED_IN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinedIn(Container newDefinedIn) {
		if (newDefinedIn != eInternalContainer() || (eContainerFeatureID() != IdlmmPackage.ALIAS_DEF__DEFINED_IN && newDefinedIn != null)) {
			if (EcoreUtil.isAncestor(this, newDefinedIn))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDefinedIn != null)
				msgs = ((InternalEObject)newDefinedIn).eInverseAdd(this, IdlmmPackage.CONTAINER__CONTAINS, Container.class, msgs);
			msgs = basicSetDefinedIn(newDefinedIn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdlmmPackage.ALIAS_DEF__DEFINED_IN, newDefinedIn, newDefinedIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IdlmmPackage.ALIAS_DEF__DEFINED_IN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDefinedIn((Container)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IdlmmPackage.ALIAS_DEF__DEFINED_IN:
				return basicSetDefinedIn(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case IdlmmPackage.ALIAS_DEF__DEFINED_IN:
				return eInternalContainer().eInverseRemove(this, IdlmmPackage.CONTAINER__CONTAINS, Container.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IdlmmPackage.ALIAS_DEF__TYPE_CODE:
				return getTypeCode();
			case IdlmmPackage.ALIAS_DEF__IDENTIFIER:
				return getIdentifier();
			case IdlmmPackage.ALIAS_DEF__REPOSITORY_ID:
				return getRepositoryId();
			case IdlmmPackage.ALIAS_DEF__VERSION:
				return getVersion();
			case IdlmmPackage.ALIAS_DEF__ABSOLUTE_NAME:
				return getAbsoluteName();
			case IdlmmPackage.ALIAS_DEF__DEFINED_IN:
				return getDefinedIn();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IdlmmPackage.ALIAS_DEF__TYPE_CODE:
				setTypeCode((String)newValue);
				return;
			case IdlmmPackage.ALIAS_DEF__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case IdlmmPackage.ALIAS_DEF__REPOSITORY_ID:
				setRepositoryId((String)newValue);
				return;
			case IdlmmPackage.ALIAS_DEF__VERSION:
				setVersion((String)newValue);
				return;
			case IdlmmPackage.ALIAS_DEF__ABSOLUTE_NAME:
				setAbsoluteName((String)newValue);
				return;
			case IdlmmPackage.ALIAS_DEF__DEFINED_IN:
				setDefinedIn((Container)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IdlmmPackage.ALIAS_DEF__TYPE_CODE:
				setTypeCode(TYPE_CODE_EDEFAULT);
				return;
			case IdlmmPackage.ALIAS_DEF__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case IdlmmPackage.ALIAS_DEF__REPOSITORY_ID:
				setRepositoryId(REPOSITORY_ID_EDEFAULT);
				return;
			case IdlmmPackage.ALIAS_DEF__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case IdlmmPackage.ALIAS_DEF__ABSOLUTE_NAME:
				setAbsoluteName(ABSOLUTE_NAME_EDEFAULT);
				return;
			case IdlmmPackage.ALIAS_DEF__DEFINED_IN:
				setDefinedIn((Container)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IdlmmPackage.ALIAS_DEF__TYPE_CODE:
				return TYPE_CODE_EDEFAULT == null ? typeCode != null : !TYPE_CODE_EDEFAULT.equals(typeCode);
			case IdlmmPackage.ALIAS_DEF__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case IdlmmPackage.ALIAS_DEF__REPOSITORY_ID:
				return REPOSITORY_ID_EDEFAULT == null ? repositoryId != null : !REPOSITORY_ID_EDEFAULT.equals(repositoryId);
			case IdlmmPackage.ALIAS_DEF__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case IdlmmPackage.ALIAS_DEF__ABSOLUTE_NAME:
				return ABSOLUTE_NAME_EDEFAULT == null ? absoluteName != null : !ABSOLUTE_NAME_EDEFAULT.equals(absoluteName);
			case IdlmmPackage.ALIAS_DEF__DEFINED_IN:
				return getDefinedIn() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IDLType.class) {
			switch (derivedFeatureID) {
				case IdlmmPackage.ALIAS_DEF__TYPE_CODE: return IdlmmPackage.IDL_TYPE__TYPE_CODE;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case IdlmmPackage.ALIAS_DEF__IDENTIFIER: return IdlmmPackage.NAMED_ELEMENT__IDENTIFIER;
				default: return -1;
			}
		}
		if (baseClass == Contained.class) {
			switch (derivedFeatureID) {
				case IdlmmPackage.ALIAS_DEF__REPOSITORY_ID: return IdlmmPackage.CONTAINED__REPOSITORY_ID;
				case IdlmmPackage.ALIAS_DEF__VERSION: return IdlmmPackage.CONTAINED__VERSION;
				case IdlmmPackage.ALIAS_DEF__ABSOLUTE_NAME: return IdlmmPackage.CONTAINED__ABSOLUTE_NAME;
				case IdlmmPackage.ALIAS_DEF__DEFINED_IN: return IdlmmPackage.CONTAINED__DEFINED_IN;
				default: return -1;
			}
		}
		if (baseClass == TypedefDef.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == IDLType.class) {
			switch (baseFeatureID) {
				case IdlmmPackage.IDL_TYPE__TYPE_CODE: return IdlmmPackage.ALIAS_DEF__TYPE_CODE;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case IdlmmPackage.NAMED_ELEMENT__IDENTIFIER: return IdlmmPackage.ALIAS_DEF__IDENTIFIER;
				default: return -1;
			}
		}
		if (baseClass == Contained.class) {
			switch (baseFeatureID) {
				case IdlmmPackage.CONTAINED__REPOSITORY_ID: return IdlmmPackage.ALIAS_DEF__REPOSITORY_ID;
				case IdlmmPackage.CONTAINED__VERSION: return IdlmmPackage.ALIAS_DEF__VERSION;
				case IdlmmPackage.CONTAINED__ABSOLUTE_NAME: return IdlmmPackage.ALIAS_DEF__ABSOLUTE_NAME;
				case IdlmmPackage.CONTAINED__DEFINED_IN: return IdlmmPackage.ALIAS_DEF__DEFINED_IN;
				default: return -1;
			}
		}
		if (baseClass == TypedefDef.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (typeCode: ");
		result.append(typeCode);
		result.append(", identifier: ");
		result.append(identifier);
		result.append(", repositoryId: ");
		result.append(repositoryId);
		result.append(", version: ");
		result.append(version);
		result.append(", absoluteName: ");
		result.append(absoluteName);
		result.append(')');
		return result.toString();
	}

} //AliasDefImpl
