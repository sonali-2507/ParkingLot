package Repositories;

import Models.Gate;

import javax.swing.text.html.Option;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GateRepositories {
    private Map<Long,Gate> gates = new HashMap<>();
    public Optional<Gate> getGateById(Long id){
        if(gates.containsKey(id)){
            return Optional.of(gates.get(id));
        }
        return Optional.empty();
    }
}
