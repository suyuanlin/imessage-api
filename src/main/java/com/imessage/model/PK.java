package com.imessage.model;

import java.io.Serializable;

public interface PK extends Serializable {
	Serializable getPK();

	void setPK(Serializable pk);
}
