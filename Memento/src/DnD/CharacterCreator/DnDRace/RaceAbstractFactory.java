package DnD.CharacterCreator.DnDRace;

import DnD.CharacterCreator.DnDRace.CharacterRace;

public interface RaceAbstractFactory {
    public CharacterRace create(String type);
}
