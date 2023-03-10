package com.game.service;

import com.game.entity.Player;
import com.game.entity.Profession;
import com.game.entity.Race;
import com.game.repository.IPlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

@Service
public class PlayerService {
    private final IPlayerRepository playerRepository;

    public PlayerService(@Qualifier("db") @Autowired IPlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> getAll(int pageNumber, int pageSize) {
        return playerRepository.getAll(pageNumber, pageSize);
    }

    public Integer getAllCount() {
        return playerRepository.getAllCount();
    }

    public Player createPlayer(String name, String title, Race race, Profession profession, long birthday, boolean banned, int level) {
        Player player = new Player();
        player.setName(name);
        player.setTitle(title);
        player.setRace(race);
        player.setProfession(profession);
        player.setBirthday(new Date(birthday));
        player.setBanned(banned);
        player.setLevel(level);

        return playerRepository.save(player);
    }

    public Player updatePlayer(long id, String name, String title, Race race, Profession profession, Boolean banned) {
        Player player = playerRepository.findById(id).orElse(null);
        if (isNull(player)) {
            return null;
        }

        boolean needUpdate = false;

        if (!StringUtils.isEmpty(name) && name.length() <= 12) {
            player.setName(name);
            needUpdate = true;
        }
        if (!StringUtils.isEmpty(title) && title.length() <= 30) {
            player.setTitle(title);
            needUpdate = true;
        }
        if (nonNull(race)) {
            player.setRace(race);
            needUpdate = true;
        }
        if (nonNull(profession)) {
            player.setProfession(profession);
            needUpdate = true;
        }

        if (nonNull(banned)) {
            player.setBanned(banned);
            needUpdate = true;
        }

        if (needUpdate) {
            playerRepository.update(player);
        }

        return player;
    }

    public Player delete(long id) {
        Player player = playerRepository.findById(id).orElse(null);
        if (isNull(player)) {
            return null;
        }

        playerRepository.delete(player);
        return player;
    }
}