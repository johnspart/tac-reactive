package co.com.tac.constant;

public enum CargoUsuario {
	ADMIN;

	public static String[] getNames() {
		String[] names = new String[CargoUsuario.values().length];
		for (CargoUsuario enmTmp : CargoUsuario.values()) {
			names[enmTmp.ordinal()] = enmTmp.name();
		}
		return names;
	}

}
