package com.game.repository;

import com.game.entity.Player;
import com.game.entity.Profession;
import com.game.entity.Race;
import org.springframework.stereotype.Repository;

import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

@Repository(value = "memory")
public class PlayerRepositoryMemory implements IPlayerRepository {

    private static final List<Player> storage = new CopyOnWriteArrayList<Player>() {{
        add(new Player(1L, "Ниус", "Приходящий Без Шума", Race.HOBBIT, Profession.ROGUE, new Date(1244497480000L), false, 33));
        add(new Player(2L, "Никрашш", "НайтВульф", Race.ORC, Profession.WARRIOR, new Date(1152424240000L), false, 58));
        add(new Player(4L, "Эззэссэль", "шипящая", Race.DWARF, Profession.CLERIC, new Date(1243201400000L), true, 3));
        add(new Player(5L, "Бэлан", "Тсе Раа", Race.DWARF, Profession.ROGUE, new Date(1241378440000L), true, 29));
        add(new Player(6L, "Элеонора", "Бабушка", Race.HUMAN, Profession.SORCERER, new Date(1214155000000L), true, 35));
        add(new Player(7L, "Эман", "Ухастый Летун", Race.ELF, Profession.SORCERER, new Date(1214772360000L), false, 56));
        add(new Player(8L, "Талан", "Рожденный в Бронксе", Race.GIANT, Profession.ROGUE, new Date(1217853300000L), false, 36));
        add(new Player(9L, "Арилан", "Благотворитель", Race.ELF, Profession.SORCERER, new Date(1216022000000L), false, 34));
        add(new Player(10L, "Деракт", "Эльфёнок Красное Ухо", Race.ELF, Profession.ROGUE, new Date(1215043720000L), false, 55));
        add(new Player(12L, "Архилл", "Смертоносный", Race.GIANT, Profession.PALADIN, new Date(1243141000000L), false, 38));
        add(new Player(13L, "Эндарион", "Маленький эльфенок", Race.ELF, Profession.DRUID, new Date(1219611120000L), false, 45));
        add(new Player(17L, "Фаэрвин", "Темный Идеолог", Race.HUMAN, Profession.NAZGUL, new Date(1216967280000L), false, 12));
        add(new Player(18L, "Харидин", "Бедуин", Race.TROLL, Profession.WARRIOR, new Date(1211454600000L), false, 47));
        add(new Player(19L, "Джур", "БоРец с жАжДой", Race.ORC, Profession.DRUID, new Date(1211860680000L), false, 23));
        add(new Player(20L, "Грон", "оин обреченный на бой", Race.GIANT, Profession.PALADIN, new Date(1218401160000L), false, 58));
        add(new Player(21L, "Морвиел", "Копье Калимы", Race.ELF, Profession.CLERIC, new Date(1244696560000L), false, 31));
        add(new Player(22L, "Ннуфис", "ДиамантоваЯ", Race.HUMAN, Profession.ROGUE, new Date(1214556360000L), false, 56));
        add(new Player(25L, "Ырх", "Троль гнет ель", Race.TROLL, Profession.WARRIOR, new Date(1244687920000L), true, 51));
        add(new Player(26L, "Блэйк", "Серый Воин", Race.HUMAN, Profession.ROGUE, new Date(1242512800000L), false, 54));
        add(new Player(27L, "Нэсс", "Бусинка", Race.TROLL, Profession.WARRIOR, new Date(1216022000000L), true, 35));
        add(new Player(28L, "Ферин", "Воитель", Race.TROLL, Profession.WARRIOR, new Date(1216582000000L), false, 48));
        add(new Player(29L, "Солках", "Ученик Магии", Race.ELF, Profession.SORCERER, new Date(1211843400000L), false, 54));
        add(new Player(30L, "Сцинк", "Титан Войны", Race.GIANT, Profession.WARRIOR, new Date(1216315760000L), true, 41));
        add(new Player(32L, "Айша", "Искусительница", Race.HUMAN, Profession.CLERIC, new Date(1217761800000L), false, 45));
        add(new Player(33L, "Тант", "Черт закAтай вату", Race.DWARF, Profession.PALADIN, new Date(1214741200000L), false, 25));
        add(new Player(34L, "Трениган", "Великий Волшебник", Race.ELF, Profession.SORCERER, new Date(1216020000000L), false, 42));
        add(new Player(35L, "Вуджер", "Печальный", Race.TROLL, Profession.NAZGUL, new Date(1210163720000L), false, 42));
        add(new Player(36L, "Камираж", "БAнкир", Race.DWARF, Profession.CLERIC, new Date(1216454000000L), true, 39));
        add(new Player(41L, "Ларкин", "СвЯтой", Race.HOBBIT, Profession.CLERIC, new Date(1219740720000L), false, 46));
        add(new Player(42L, "Зандир", "Темновидец", Race.ELF, Profession.WARRIOR, new Date(1214850120000L), false, 23));
        add(new Player(43L, "Балгор", "пещерный Урук", Race.ORC, Profession.NAZGUL, new Date(1211597960000L), false, 18));
        add(new Player(44L, "Регарн", "юбитель ОЛивье", Race.GIANT, Profession.WARRIOR, new Date(1197692680000L), false, 53));
        add(new Player(45L, "Анжелли", "Молодой Боец", Race.DWARF, Profession.WARRIOR, new Date(1247890000000L), false, 33));
        add(new Player(23L, "Джерис", "Имперский Воин", Race.ORC, Profession.WARRIOR, new Date(1216630320000L), false, 58));
        add(new Player(46L, "Жэкс", "Ярочкино Солнышко", Race.GIANT, Profession.WARRIOR, new Date(1214879560000L), false, 3));
        add(new Player(47L, "Филуэль", "Химик и Карпускулярник.", Race.ELF, Profession.WARRIOR, new Date(1244445640000L), false, 30));
        add(new Player(48L, "Яра", "Прельстивая", Race.HUMAN, Profession.CLERIC, new Date(1241309300000L), false, 52));
        add(new Player(49L, "Иллинас", "Иероглиф", Race.HOBBIT, Profession.WARRIOR, new Date(1240834120000L), false, 47));
        add(new Player(50L, "Ардонг", "Вспышк A", Race.HUMAN, Profession.WARRIOR, new Date(1217537160000L), false, 21));
        add(new Player(52L, "Аттирис", "и.о.Карвандоса", Race.ELF, Profession.SORCERER, new Date(1245050800000L), true, 34));
    }};

    @Override
    public List<Player> getAll(int pageNumber, int pageSize) {
        return storage.stream()
                .sorted(Comparator.comparingLong(Player::getId))
                .skip((long) pageNumber * pageSize)
                .limit(pageSize)
                .collect(Collectors.toList());

    }

    @Override
    public int getAllCount() {
        return storage.size();
    }

    @Override
    public Player save(Player player) {
        player.setId(getMaxId() + 1);
        storage.add(player);
        return player;
    }

    @Override
    public Player update(Player player) {
        return player;
    }

    @Override
    public Optional<Player> findById(long id) {
        return storage.stream().filter(player -> id == player.getId()).findFirst();
    }

    @Override
    public void delete(Player player) {
        storage.remove(player);
    }

    private long getMaxId() {
        return storage.stream()
                .map(Player::getId)
                .max(Long::compareTo)
                .orElse(1L);
    }
}