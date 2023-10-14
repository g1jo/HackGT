//import './App.css';
import { useNavigate } from 'react-router'
import Generate from '../components/GenerateBtn'
import Edit from '../components/EditBtn'

const Home = () => {
    const navigate = useNavigate();

    const handleClick1 = () => {
        navigate("/input", {replace: true});
    }

    const handleClick2 = () => {
        navigate("/generate", {replace: true});
    }


    return (
        <div className="Clothing Finder Home">
        <h1><center>Welcome to Clothing Finder Home</center></h1>
        <div style={{position: 'absolute', left: '35%'}}>
        <table>
            <tr>
                <th>Edit Closet</th>
                <td><button onClick={handleClick1}>+</button></td>
            </tr>
            <tr>
                <td><b>Generate Outfit</b></td>
                <td><button onClick={handleClick2}>+</button></td>
            </tr>
            </table>
        </div>
        </div>
    );
}

export default Home;
